class Solution {
    public boolean signcheck(int a ,int b){
        if((a>0 && b>0) || (a<0 && b<0)){
            return true;
        }
        else{
            return false;
        }
    }
    public int[] asteroidCollision(int[] asteroids) {
          int i=0,n=asteroids.length;
        Stack<Integer>st=new Stack<Integer>();
        while(i<n){
            if(st.isEmpty()==true){
                st.push(asteroids[i]);
                i++;
            }
            else{
                if(signcheck(st.peek(),asteroids[i])==true){
                    st.push(asteroids[i]);
                    i++;
                }
                else{
                    if(st.peek()>0){
                        int a=Math.abs(st.peek());
                        int b=Math.abs(asteroids[i]);
                        if(a>b){
                            i++;
                        }
                        else if(a==b){
                            st.pop();
                            i++;
                        }
                        else{
                            st.pop();
                        }
                    }
                    else{
                        st.push(asteroids[i]);
                        i++;
                    }
                }
            }

        }
        n=st.size();
        int[] out=new int[n];
        for(i=n-1;i>=0;i--){
            out[i]=st.pop();
        }
        return out;


    }
}
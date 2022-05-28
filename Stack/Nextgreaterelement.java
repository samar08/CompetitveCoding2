public class Solution {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
     ArrayList<Integer>out=new ArrayList<Integer>();
        int i,j,n=A.size();
        Stack<Integer>st=new Stack<Integer>();
        for(i=n-1;i>=0;i--){
            if(st.isEmpty()==true){
                out.add(-1);
                st.push(A.get(i));
            }
            else{
                while(st.isEmpty()==false && A.get(i)>=st.peek()){
                    st.pop();
                }
                if(st.isEmpty()==true){
                    out.add(-1);
                    st.push(A.get(i));
                }
                else{
                    out.add(st.peek());
                    st.push(A.get(i));
                }
            }
        }
        for(i=0;i<(int)n/2;i++){
                int temp=out.get(n-i-1);
                out.set(n-i-1,out.get(i));
                out.set(i,temp);
            }
        return out;
    }
}

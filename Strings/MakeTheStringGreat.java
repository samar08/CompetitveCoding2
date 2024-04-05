class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        int i,n=s.length();
        st.push(s.charAt(0));
        i=1;
        while(i<n){
            // if(st.isEmpty()==true){
            //     st.push(s.charAt(i));
            // }
            if(Character.isUpperCase(s.charAt(i))==true){
             if(st.isEmpty()==false && Character.isLowerCase(st.peek())==true){
                char c=Character.toLowerCase(s.charAt(i));
                if(c==st.peek()){
                    if(st.isEmpty()==false && c==st.peek()){
                        //System.out.println("1 i: "+i);
                        st.pop();
                    }
                    
                }
                else{
                    st.push(s.charAt(i));
                }
                
             }
             else{
                st.push(s.charAt(i));
             }
            }
            else{
                if(st.isEmpty()==false  && Character.isUpperCase(st.peek())==true){
                    char c=Character.toUpperCase(s.charAt(i));
                    if(c==st.peek()){
                    if(st.isEmpty()==false && c==st.peek()){
                       // System.out.println("2 i: "+i);
                        st.pop();
                    }
                    
                }
                else{
                st.push(s.charAt(i));
                }

                }
                else{
                st.push(s.charAt(i));
             }
            }
            i+=1;
        }
        StringBuilder sb=new StringBuilder();
        while(st.isEmpty()==false){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
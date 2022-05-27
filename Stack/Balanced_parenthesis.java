public class Solution {
    public int solve(String A) {
        int n=A.length();
        int i=0;
        Stack<Character>st=new Stack<Character>();
        for(i=0;i<n;i++){
            if(A.charAt(i)=='(' || A.charAt(i)=='{' || A.charAt(i)=='[' ){
                st.push(A.charAt(i));
            }
            else if(A.charAt(i)==']'){
                if(st.isEmpty()==false && st.peek()=='['){
                    st.pop();
                }
                else{
                    return 0;
                }
            }
             else if(A.charAt(i)=='}'){
                if(st.isEmpty()==false && st.peek()=='{'){
                    st.pop();
                }
                else{
                    return 0;
                }
            }
             else if(A.charAt(i)==')'){
                if(st.isEmpty()==false && st.peek()=='('){
                    st.pop();
                }
                else{
                    return 0;
                }
            }

        }
        if(st.isEmpty()==false){
            return 0;
        }
        return 1;
    }

}

public class Solution {
    public String solve(String A) {
        Stack<Character>st=new Stack<Character>();
        int n=A.length(),i;
        i=0;
        while(i<n){
            if(st.isEmpty()==true || st.peek()!=A.charAt(i)){
                st.push(A.charAt(i));
            }
            else if(st.peek()==A.charAt(i)){
                st.pop();
            }
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(st.isEmpty()==false){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();

    }
}

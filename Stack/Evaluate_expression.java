public class Solution {
    public int evalRPN(ArrayList<String> A) {
        int n=A.size();
        int i;
        Stack<String>st=new Stack<String>();
        int c=0;
        for(i=0;i<n;i++){
            if(A.get(i).equals("+") || A.get(i).equals("-") || A.get(i).equals("*") || A.get(i).equals("/")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                if(A.get(i).equals("+")){
                   c=b+a;
                }
                else if(A.get(i).equals("-")){
                    c=b-a;
                }
                else if(A.get(i).equals("*")){
                    c=b*a;
                }
                else if(A.get(i).equals("/")){
                    c=(int)(b/a);
                }
                st.push(Integer.toString(c));
            }
            else{
            st.push(A.get(i));
            }
            //System.out.println(st);
        }
        return Integer.parseInt(st.pop());
    }
}

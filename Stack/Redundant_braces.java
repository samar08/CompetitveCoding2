public class Solution {
    public int braces(String A) {
        int n=A.length();
        int i;
        char c;
        Stack<Character>st=new Stack<Character>();
        boolean found=false;
        for(i=0;i<n;i++){
            if(A.charAt(i)==')'){
                if(st.peek()=='('){
                    return 1;
                }
                else{
                    found=false;
                    while(st.isEmpty()==false && st.peek()!='('){
                        c=st.pop();
                        if(c=='+' || c=='-' || c=='*' || c=='/'){
                            found=true;
                        }
                    }
                    if(st.isEmpty()==false){
                        c=st.pop();
                        if(c=='+' || c=='-' || c=='*' || c=='/'){
                            found=true;
                        }
                    }
                    if(found==false){
                        return 1;
                    }
                    
                }
            }
            else{
                st.push(A.charAt(i));
            }
        }
        return 0;
    }
}

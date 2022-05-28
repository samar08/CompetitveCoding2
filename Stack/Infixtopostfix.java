public class Solution {
    public String solve(String A) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        map.put('^',3);
        map.put('/',2);
        map.put('*',2);
        map.put('+',1);
        map.put('-',1);
        map.put('(',0);
        map.put(')',0);

        Stack<Character>st=new Stack<Character>();
        int i=0;
        int n=A.length();
        for(i=0;i<n;i++){
            char c=A.charAt(i);
            if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^'){
                while(st.isEmpty()==false && map.get(c)<=map.get(st.peek()) ){
                    
                    char popc=st.pop();
                    sb.append(popc);
                }
                
                st.push(c);
                
            }
            else if(c=='('){
                st.push(c);
            }
            else if(c!='(' && c!=')'){
                sb.append(c);
            }
            else if(c==')'){
                while(st.isEmpty()==false && st.peek()!='('){
                    char popc=st.pop();
                    sb.append(popc);
                }
                if(st.isEmpty()==false && st.peek()=='('){
                    st.pop();
                }
            }
           // System.out.println(st);
           // System.out.println(sb);
        }
        while(st.isEmpty()==false){
            sb.append(st.pop());
        }
        return sb.toString();
        
    }
}

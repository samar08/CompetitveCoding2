public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer>out=new ArrayList<Integer>();
        int i,j,n=A.size();
        Stack<Integer>st=new Stack<Integer>();
        for(i=0;i<n;i++){
            if(st.isEmpty()==true){
                out.add(-1);
                st.push(A.get(i));
            }
            else{
                while(st.isEmpty()==false && A.get(i)<=st.peek()){
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
        return out;
    }
}

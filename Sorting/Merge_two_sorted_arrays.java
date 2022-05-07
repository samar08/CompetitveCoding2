public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        int n=A.size();
        int m=B.size();
        int i=0,j=0;
        ArrayList<Integer>out=new ArrayList<Integer>();
        while(i<n && j<m){
            if(A.get(i)<B.get(j)){
                out.add(A.get(i));
                i++;
            }
            else{
                out.add(B.get(j));
                j++;
            }
        }
        while(i<n){
           out.add(A.get(i));
                i++;
        }
        while(j<m){
            out.add(B.get(j));
                j++;
        }
        return out;
    }
}

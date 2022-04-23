public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int n=A.size();
        int i;
        int res=0;
        for(i=0;i<n;i++){
            res=res^A.get(i);
        }
        return res;
    }
}

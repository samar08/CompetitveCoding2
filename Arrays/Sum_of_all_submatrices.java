public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size();
        int i,j,sumi=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                sumi+=A.get(i).get(j)*((i+1)*(j+1)*(n-i)*(n-j));
            }
        }
        return sumi;
    }
}

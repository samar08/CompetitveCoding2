public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int i,n=A.size();
        int mini=Integer.MAX_VALUE;
        for(i=0;i<n-1;i++){
            mini=Math.min(mini,A.get(i+1)-A.get(i));
        }
        return mini;
        //return A.get(1)-A.get(0);
    }
}

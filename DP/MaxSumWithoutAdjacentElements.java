public class Solution {
    public int adjacent(ArrayList<ArrayList<Integer>> A) {
        int i,n=A.get(0).size();
        int[] dp=new int[n];
        dp[0]=Math.max(A.get(0).get(0), A.get(1).get(0));
        if(n==1){
            return dp[0];
        }
        dp[1]=Math.max(dp[0],Math.max(A.get(0).get(1),A.get(1).get(1)));
        for(i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1], Math.max(A.get(0).get(i),A.get(1).get(i))+dp[i-2]);
        }
        return dp[n-1];
    }
}

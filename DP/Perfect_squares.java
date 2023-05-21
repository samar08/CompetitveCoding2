//bottom up approach
public class Solution {
    public int countMinSquares(int A) {
        int i,j;
        int[] dp=new int[A+1];
        for(i=0;i<=A;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(i=1;i<=A;i++){
            
            for(j=1;j*j<=i;j++){
                int temp=j*j;
                dp[i]=Math.min(dp[i],1+dp[i-temp]);
            }
        }
        return dp[A];
    }
}

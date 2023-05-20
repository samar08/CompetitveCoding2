import java.lang.*;
public class Solution {
    public int climbStairs(int A) {
        int[]dp=new int[A+1];
        int mod=(int)Math.pow(10,9)+7;
        dp[1]=1;
        dp[0]=1;
        if(A==1){
            return dp[1];
        }
        for(int i=2;i<=A;i++){
            dp[i]=((dp[i-1])%mod+(dp[i-2])%mod)%mod;
        }
        return dp[A];
    }
}

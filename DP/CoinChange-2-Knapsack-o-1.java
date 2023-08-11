class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int i,j;
        int[][] dp=new int[n][amount+1];
        for(i=0;i<n;i++){
            for(j=0;j<=amount;j++){
                if(i==0){
                    if(j%coins[i]==0){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=0;
                    }
                }
                else{
                    if(coins[i]<=j){
                        dp[i][j]=dp[i-1][j]+dp[i][j-coins[i]];
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                    
                }
            }
        }
        return dp[n-1][amount];
    }
}
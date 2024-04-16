/*
 * Question link: https://www.geeksforgeeks.org/problems/find-optimum-operation4504/1
 */
class Solution
{
    public int minOperation(int n)
    {
        if(n<=3){
            return n;
        }
        int[] dp=new int[n+1];
        int i;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(i=4;i<=n;i++){
            if(i%2==0){
                dp[i]=Math.min(dp[(int)(i/2)]+1, dp[i-1]+1);
            }
            else{
                dp[i]=dp[i-1]+1;
            }
        }
        return dp[n];
    }
}
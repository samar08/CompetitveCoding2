class Solution {
    public int longestPalindromeSubseq(String s) {
        int i,j,n=s.length(),k=0,maxi=1;
        int[][] dp=new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    dp[i][j]=1;
                }
            }
        }
        for(k=1;k<n;k++){
            for(i=0;i<n-k;i++){
                j=i+k;
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=2+dp[i+1][j-1];
                    maxi=Math.max(maxi,dp[i][j]);
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                    maxi=Math.max(maxi,dp[i][j]);
                }
            }
        }
        return maxi;


    }
}
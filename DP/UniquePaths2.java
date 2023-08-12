class Solution {
    
    public int uniquePathsWithObstacles(int[][] mat) {
        int i=0,j=0,m=mat.length,n=mat[0].length;
        int out=0;
        int[][]dp=new int[m][n];
        j=0;
        int xfound=0;
        int yfound=0;
        for(i=0;i<m;i++){
            if(mat[i][j]==1 || xfound==1){
                dp[i][j]=0;
                xfound=1;

            }
            else{
                dp[i][j]=1;
            }
        }
        i=0;
        for(j=0;j<n;j++){
            if(mat[i][j]==1 || yfound==1){
                dp[i][j]=0;
                yfound=1;
            }
            else{
                dp[i][j]=1;
            }
        }
        for(i=1;i<m;i++){
            for(j=1;j<n;j++){
                if(mat[i][j]==1){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
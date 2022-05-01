public class Solution {
    public int solve(int A, int B, int C) {
        int n=A;
        int r=B;
        int m=C;
        int[] dp=new int[r+1];
        int[] op=new int[r+1];
        int i,j;
        dp[0]=1;
        dp[1]=1;
        for(j=2;j<=r;j++){
            dp[j]=-1;
        }
        for(i=2;i<=n;i++){
            for(j=0;j<=r;j++){
                if(j>i){
                    op[j]=-1;
                }
                else if(j==0){
                    op[j]=1;
                }
                else if(i==j){
                    op[j]=1;
                }
                else{
                    int temp=(dp[j-1]+dp[j])%m;
                    op[j]=temp;
                }
            }
            for(j=0;j<=r;j++){
                dp[j]=op[j];
            }
        }
        return dp[r];

    }
}


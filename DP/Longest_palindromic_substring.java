class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int i,j;
        int[][]dp=new int[n][n];
        int maxi=0;
        int len=1,st=0,end=0;
        while(len<=n){
            for(i=0;i<=n-len;i++){
                j=i+(len-1);
                if(i==j){
                    dp[i][j]=1;
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        if(len<=2){
                            dp[i][j]=1;
                        }
                        else{
                            if(dp[i+1][j-1]==1){
                                dp[i][j]=1;
                            }
                            else{
                                dp[i][j]=0;
                            }
                        }
                    }
                    else{
                        dp[i][j]=0;
                    }
                }
            }
            len+=1;
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(dp[i][j]==1){
                    if(Math.abs(j-i)+1>maxi){
                        maxi=Math.abs(j-i)+1;
                        st=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(st,end+1);
    }
}
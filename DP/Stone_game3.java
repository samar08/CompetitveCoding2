class Solution {

    public int solve(int i,int[] stones,int n,int[] dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ans=Integer.MIN_VALUE;
    if(i<n){
        ans=Math.max(ans,stones[i]-solve(i+1,stones,n,dp));
    }
    if(i+1<n){
        ans=Math.max(ans,stones[i]+stones[i+1]-solve(i+2,stones,n,dp));
    }
    if(i+2<n){
        ans=Math.max(ans,stones[i]+stones[i+1]+stones[i+2]-solve(i+3,stones,n,dp));
    }
    return dp[i]=ans;

    }
public String stoneGameIII(int[] stones) {
    int i=0,n=stones.length,turn=0;
    int A=0,B=0,k,j;
    int[] dp=new int[n];
    for(i=0;i<n;i++)
    dp[i]=-1;
    int ans=Integer.MIN_VALUE;
    i=0;
    if(i<n){
        ans=Math.max(ans,stones[i]-solve(i+1,stones,n,dp));
    }
    if(i+1<n){
        ans=Math.max(ans,stones[i]+stones[i+1]-solve(i+2,stones,n,dp));
    }
    if(i+2<n){
        ans=Math.max(ans,stones[i]+stones[i+1]+stones[i+2]-solve(i+3,stones,n,dp));
    }
    if(ans>0){
        return "Alice";
    }
    else if(ans==0){
        return "Tie";
    }
    else{
        return "Bob";
    }
   
    
}
}
class Solution {
    public int spaceopt(int[] nums,int n){
        int p1=0,out=0;
        int p2=nums[0];
        if(n==1){
            return p2;
        }
        for(int i=1;i<n;i++){
            out=Math.max(nums[i]+p1,p2);
            p1=p2;
            p2=out;
        }
        return out;
    }
    public int dp(int[]nums,int n){
        int i;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(i=1;i<n;i++){
            dp[i+1]=Math.max(dp[i],nums[i]+dp[i-1]);
        }
        return dp[n];
    }
    public void findmax(int[]rob,int n,int i,int prev,int sum,int[] out){
        if(i>=n){
            return;
        }
        if(i-prev<=1){
            findmax(rob,n,i+1,prev,sum,out);
        }
        else{
            findmax(rob,n,i+1,prev,sum,out);
            prev=i;
            sum+=rob[i];
            out[0]=Math.max(out[0],sum);
            findmax(rob,n,i+1,prev,sum,out);
        }
        
    }
    public int rob(int[] nums) {
        int n=nums.length,i=0,prev=-2,sum=0;
        /*
        recursive
        int[] out=new int[]{0};
        findmax(nums,n,i,prev,sum,out);
        return out[0];
         */ 
        

        /*
        DP
        return dp(nums,n);

        */

        /* Space optimal DP*/
        return spaceopt(nums,n);
        
    }
}
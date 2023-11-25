class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int i,n=nums.length;
        int sum=0;
       
        int[] absolutesum=new int[n];
        int[] pre=new int[n];
        int[] post=new int[n];
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
            if(i==0){
                pre[i]=0;

            }
            else{
                pre[i]=nums[i-1]+pre[i-1];
            }
        }
        for(i=n-1;i>=0;i--){
            if(i==n-1) 
            {
                post[i]=0;
            }
            else{
                post[i]=nums[i+1]+post[i+1];
            }

        }
        
        for(i=0;i<n;i++){
            absolutesum[i]=((nums[i]*(i))-pre[i])+(post[i]-(nums[i]*(n-i-1)));

        }
        return absolutesum;
    }
}
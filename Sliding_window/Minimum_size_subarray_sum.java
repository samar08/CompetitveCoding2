class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini=Integer.MAX_VALUE,i,n=nums.length;
        int left=0,right=0,sum=0;
        sum+=nums[right];
        while(left<=right && right<n){
            if(sum>=target){
                mini=Math.min(mini,right-left+1);
                sum-=nums[left];
                left+=1;
                if(left>right){
                    right=left;
                }
            }
            else if(sum<target && right<n){
                right+=1;
                if(right<n){
                    sum+=nums[right];
                }
                
            }
            else if(sum<target && right>=n){
                return 0;
            }
        }
        if(mini==Integer.MAX_VALUE){
            return 0;
        }
        return mini;
    }
}
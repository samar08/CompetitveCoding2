class Solution {
    public int findPeakElement(int[] nums) {
        int i,n=nums.length;
        int low=0,high=n-1;
        int mid=0;
        if(n==1){
            return 0;
        }
        while(low<=high){
            mid=low+(int)((high-low)/2);
            if(mid==0){
                if(nums[mid]>nums[mid+1]){
                    return mid;
                }
                else{
                    return mid+1;
                }
            }
            else if(mid==n-1){
                if(nums[mid]>nums[mid-1]){
                    return mid;
                }
                else{
                    return mid-1;
                }
            }
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return 0;
    }
}
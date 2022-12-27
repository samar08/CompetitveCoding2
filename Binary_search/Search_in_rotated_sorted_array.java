class Solution {
    public int binsearch(int[] nums,int i,int j,int target){
        while(i<=j){
            int mid=i+(int)((j-i)/2);
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int i,j,n=nums.length,pivot=-1;
        for(i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                pivot=i;
            }
        }
        int right=binsearch(nums,pivot+1,n-1,target);
        int left=binsearch(nums,0,pivot,target);
        return Math.max(left,right);
        
    }
}
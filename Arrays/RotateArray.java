class Solution {
    public void reverse(int[] nums,int low, int high){
        while(low<high){
            int temp=nums[high];
            nums[high]=nums[low];
            nums[low]=temp;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length,i;
        k=k%n;
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0,n-1);

    }
}
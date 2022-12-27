class Solution {
    public int leftpos(int[] nums,int i,int j,int target){
        while(i<=j){
            int mid=i+(int)((j-i)/2);
            if(nums[mid]==target){
                int other=leftpos(nums,i,mid-1,target);
                if(other!=-1){
                return Math.min(mid,other);
                }
                else{
                    return mid;
                }
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
    public int rightpos(int[] nums,int i,int j,int target){
        int n=nums.length;
        while(i<=j){
            int mid=i+(int)((j-i)/2);
            if(nums[mid]==target){
                int other=rightpos(nums,mid+1,j,target);
                if(other<=n-1){
                return Math.max(mid,other);
                }
                else{
                    return mid;
                }
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
    public int[] searchRange(int[] nums, int target) {
        int i=0,n=nums.length,j=n-1;
        int[] out=new int[2];
        out[0]=leftpos(nums,i,j,target);
        out[1]=rightpos(nums,i,j,target);
        return out;
    }
}
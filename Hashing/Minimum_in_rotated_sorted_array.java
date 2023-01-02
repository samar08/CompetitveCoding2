import java.util.*;
class Solution {
    public int findMin(int[] nums) {
        int i=0,n=nums.length,j=n-1;
        if(n==1){
            return nums[0];
        }
        while(i<=j){
            int mid=i+(int)((j-i)/2);
            if((mid>0 && mid<n-1)){
                if((nums[mid]>nums[mid-1]) && (nums[mid]>nums[mid+1])){
                    return (nums[mid+1]);
                }
                else if((nums[mid]<nums[mid-1]) && (nums[mid]<nums[mid+1])){
                    return nums[mid];
                }
                else if(nums[mid]>nums[mid-1] && (nums[mid]<nums[mid+1])){
                    if(nums[mid]>nums[0]){
                        i=mid+1;
                    }
                    else{
                        j=mid-1;
                    }
                }
            }
            else if(mid==0){
                return Math.min(nums[0],nums[mid+1]);
            }
            else if(mid==n-1){
                return nums[0];
            }
        }
        return 0;
    }
}
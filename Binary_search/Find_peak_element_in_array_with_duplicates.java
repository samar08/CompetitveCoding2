/*
 * Problem Description
Given an array of integers A, find and return the peak element in it. An array element is peak if it is NOT smaller than its neighbors.

For corner elements, we need to consider only one neighbor. We ensure that answer will be unique.

NOTE: Users are expected to solve this in O(log(N)) time. The array may have duplicate elements.
Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 109
 * 
 * 
 */

public class Solution {
    public int solve(int[] nums) {
        int i,n=nums.length;
        int low=0,high=n-1;
        int mid=0;
        if(n==1){
            return nums[0];
        }
        while(low<=high){
            mid=low+(int)((high-low)/2);
            if(mid==0){
                if(nums[mid]>nums[mid+1]){
                    return nums[mid];
                }
                else{
                    return nums[mid+1];
                }
            }
            else if(mid==n-1){
                if(nums[mid]>nums[mid-1]){
                    return nums[mid];
                }
                else{
                    return nums[mid-1];
                }
            }
            if(nums[mid]>=nums[mid-1] && nums[mid]>=nums[mid+1]){
                return nums[mid];
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

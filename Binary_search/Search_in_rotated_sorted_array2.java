/*
 * Problem Description
Given a sorted array of integers A of size N and an integer B.

array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).

You are given a target value B to search. If found in the array, return its index otherwise, return -1.

You may assume no duplicate exists in the array.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints
1 <= N <= 1000000

1 <= A[i] <= 109

all elements in A are distinct.
 */

 // Solving it in O(logN) time only.
 //Will also find pivot in O(log(N)) time.
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int findpivot(int[] A,int n){
        int low=0,high=n-1,mid;
        while(low<=high){
            mid=low+(int)((high-low)/2);
            if(mid!=0 && mid!=n-1){
                if((A[mid]>A[mid-1] && A[mid]>A[mid+1]) || (A[mid]<A[mid-1] && A[mid]<A[mid+1])){
                return mid;
                }
                else if(A[mid]<A[low]){
                high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(mid==0 || mid==n-1){
                return mid;
            }
           
        }
        return high;
    }
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
    public int search(final int[] nums, int target) {
        int i=0,n=nums.length,low=0,high=n-1,mid;
        int pivot=findpivot(nums,n);
        
        if(pivot!=0 && pivot!=n-1){
            if(nums[pivot]<nums[pivot-1]){
                pivot=pivot-1;
            }
        }
        //System.out.println("pivot: "+nums[pivot]);
       int right=binsearch(nums,pivot+1,n-1,target);
        int left=binsearch(nums,0,pivot,target);
        return Math.max(left,right);

    }
}


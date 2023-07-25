class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(int)((low+high)/2);
            if(mid==0){
                low=mid+1;
                continue;
            }
            if(mid==n-1){
                high=mid-1;
                continue;
            }
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
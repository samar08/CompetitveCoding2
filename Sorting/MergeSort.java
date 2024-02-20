import java.util.*;
public class MergeSort {
    public static void mergesort(int[] arr, int low, int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr,low,mid,high);
       }
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int i,index=0;
         int[] left=new int[mid-low+1];
         int[] right=new int[high-mid];
         int l=mid-low+1;
         int r=high-mid;
         for(i=low;i<=mid;i++){
            left[index++]=arr[i];
         }
         index=0;
         for(i=mid+1;i<=high;i++){
            right[index++]=arr[i];
         }
         int i1=0,i2=0,i3=low;
         while(i1<l && i2<r){
            if(left[i1]>right[i2]){
                arr[i3++]=right[i2++];
            }
            else{
                arr[i3++]=left[i1++];
            }
         }
         while(i1<l){
            arr[i3++]=left[i1++];
         }
         while(i2<r){
            arr[i3++]=right[i2++];
         }
    }
    public static void main(String[] args) {
        
        int[] arr=new int[]{5,1,11,8,18,121,100,2,1,8,18};
        int n=arr.length,high=n-1,low=0,i;
        mergesort(arr,low,high);
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

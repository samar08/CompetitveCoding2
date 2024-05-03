/*
 * Question link: https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
 */
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int gap=(int)Math.ceil((double)(n+m)/2);
        int i,l;
        boolean once=false;
        while(gap>0 && (once==false)){
            i=0;
            l=gap;
            if(gap==1){
                once=true;
            }
            while(l<n+m){
                if(i<n && l<n){
                  if(arr1[i]>arr1[l]) {
                      long temp=arr1[l];
                      arr1[l]=arr1[i];
                      arr1[i]=temp;
                  }
                 
                }
                else if(i<n && l>=n){
                    if(arr1[i]>arr2[l-n]){
                        long temp=arr2[l-n];
                        arr2[l-n]=arr1[i];
                        arr1[i]=temp;
                    }
                }
                else if(i>=n && l>=n){
                    if(arr2[i-n]>arr2[l-n]){
                        long temp=arr2[l-n];
                        arr2[l-n]=arr2[i-n];
                        arr2[i-n]=temp;
                    }
                }
                i+=1;
                l+=1;
            }
            gap=(int)Math.ceil((double)(gap)/2);
            
            
        }
    }
}
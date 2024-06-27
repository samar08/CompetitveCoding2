class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.

    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
       int i=n-1,j=n-1,maxdiff=Integer.MIN_VALUE;
       int[] minL=new int[n];
       for(i=0;i<n;i++){
           if(i==0){
               minL[i]=a[i];
           }
           else{
               minL[i]=Math.min(minL[i-1],a[i]);
           }
       }
       i=n-1;
       while(i>=0 && j>=0){
           if(a[i]>=minL[j]){
               maxdiff=Math.max(maxdiff,i-j);
               j--;
           }
           else{
               i--;
           }
       }
       return maxdiff;
        
    }
}
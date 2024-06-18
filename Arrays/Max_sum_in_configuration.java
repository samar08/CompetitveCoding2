class Solution {
    long max_sum(int a[], int n) {
        // Your code here
       int i;
        long cum_sum=0;
        long curr_val=0,next_val=0,res=0;
        for(i=0;i<n;i++){
            cum_sum+=(long)a[i];
        }
        for(i=0;i<n;i++){
            curr_val+=(long)((long)i*(long)a[i]);
        }
        res=curr_val;
        for(i=1;i<n;i++){
            next_val=curr_val-(long)(cum_sum-a[i-1])+(long)(((long)a[i-1])*(long)(n-1));
            curr_val=next_val;
            res=Math.max(res,curr_val);
            
        }
        return res;
    
    }
}
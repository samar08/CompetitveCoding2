class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length,i=0;
        int right=1;
        int[] out=new int[n];
        out[0]=nums[0];
        for(i=1;i<n;i++){
            out[i]=nums[i]*out[i-1];
        }
        
        for(i=n-1;i>=0;i--){
            if(i>0){
                out[i]=out[i-1]*right;
            }
            else if(i==0){
                out[i]=right;
            }
            
            right=right*nums[i];
            
        }
        return out;
        
        
    }
}
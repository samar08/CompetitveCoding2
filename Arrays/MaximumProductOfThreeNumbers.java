class Solution {
    public int maximumProduct(int[] nums) {
        int i,n=nums.length,maxi=0;
        Arrays.sort(nums);
        if(nums.length==3){
            return Arrays.stream(nums).reduce(1,(ans,l)-> ans*l);
        }
        
        for(i=0;i<n;i++){

            int pro=1;
            pro=pro*nums[i]*nums[(i+1)%n]*nums[(i+2)%n];
            if(i==0){
                maxi=pro;
            }
            else{
                maxi= Math.max(maxi,pro);
            }
           
        }
        return maxi;

    }
}
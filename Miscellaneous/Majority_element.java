class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length,i=0,maj=nums[0],count=1;
        if(n==1){
            return maj;
        }
        for(i=1;i<n;i++){
            if(nums[i]==maj){
                count++;
            }
            else if(nums[i]!=maj){
                if(count>0){
                    count--;
                }
                else{
                    count=1;
                    maj=nums[i];
                }
            }
        }
        return maj;
    }
}
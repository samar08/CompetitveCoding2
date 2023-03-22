class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length,i=0,j;
        long out=0,count=0;
        while(i<n){
            if(nums[i]==0){
                count=1;
                j=i+1;
                while(j<n && nums[j]==0){
                    count+=1;
                    j+=1;
                }
                out+=(long)(count*((double)(count+1)/2));
                i=j;
            }
            i++;
        }
        return out;
    }
}
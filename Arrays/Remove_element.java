class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,n=nums.length,j=n-1;
        if(n==1){
            if(nums[0]==val){
                return 0;
            }
            else{
                return 1;
            }
        }
        if(n==0){
            return 0;
        }
        while(i<j){
            while((i<j) && ((nums[i]==val) && ((j>=0)))){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j=j-1;
            }
            if(i<j)
            i+=1;
        }
        if((i==j) && ((j<=0) && (nums[i]==val))){
        return 0;
        }
        if(nums[j]==val)
        return i;
        else
        return i+1;



    }
}

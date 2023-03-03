class Solution {
    public void heapsort(int[] nums,int n){
        int i;
        for(i=(int)(n/2)-1;i>=0;i--){
            heapify(nums,i,n);
        }
        for(i=n-1;i>0;i--){
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            heapify(nums,0,i);
        }
    }
    public void heapify(int[] nums,int st, int len){
        //int n=nums.length;
        int i=st,smallest=st;
        int left=2*i+1;
        int right=2*i+2;
        if(left<len && (nums[i]>nums[left])){
            if((right < len) && nums[right]<nums[left]){
                int temp=nums[right];
                nums[right]=nums[i];
                nums[i]=temp;
                smallest=right;
            }
            else{
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                  smallest=left;
            }
        }
        else if(right<len && (nums[i]>nums[right])){
            int temp=nums[right];
                nums[right]=nums[i];
                nums[i]=temp;
              smallest=right;
        }
        if(smallest!=st){
            heapify(nums,smallest,len);
        }

    }
    public void reverse(int[] nums,int n){
        int i;
        for(i=0;i<(int)(n/2);i++){
            int temp= nums[n-i-1];
            nums[n-i-1]=nums[i];
            nums[i]=temp;
        }
    }
    public int[] sortArray(int[] nums) {
        int i=0,n=nums.length;
        heapsort(nums,n);
        reverse(nums,n);

        return nums;

    }
}

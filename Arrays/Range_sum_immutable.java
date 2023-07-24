
class NumArray {
int[] pre;
    public NumArray(int[] nums) {
        int n=nums.length;
        int low=0,high=n-1,i=0;
       pre=new int[n+1];
        pre[0]=0;
        for(i=0;i<n;i++){
            pre[i+1]=pre[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return pre[right+1]-pre[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
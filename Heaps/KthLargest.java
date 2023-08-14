class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        int i=0,n=nums.length;
        int size=0;
        for(i=0;i<n;i++){
            if(size>=k && pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
            else if(size<k){
                pq.add(nums[i]);
                size++;
            }
            
        }
        return pq.poll();
    }
}
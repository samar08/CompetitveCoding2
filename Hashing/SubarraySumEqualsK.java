class Solution {
    public int subarraySum(int[] nums, int k) {
        int i,n=nums.length,prefixSum=0,out=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(i=0;i<n;i++){
            prefixSum+=nums[i];
            if(map.containsKey(prefixSum-k)==true){
                out+=map.get(prefixSum-k);
            }
            int temp=prefixSum;
            map.put(temp,map.getOrDefault(temp,0)+1);
            
        }
        return out;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length,i;
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       for(i=0;i<n;i++){
           int diff=target-nums[i];
           if(map.containsKey(diff)==true){
               return new int[]{i,map.get(diff)};
           }
           else{
               map.put(nums[i],i);
           }
       }
       return new int[]{0,0};
    }
}
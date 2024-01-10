class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i,n=nums.length,out=0;
       
        for(i=0;i<n;i++){
         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Iterator it=map.keySet().iterator();
        while(it.hasNext()==true){
            int next=(int)(it.next());
            if(k==0){
                if(map.get(next)>1){
                    out+=1;
                }
            }
            else{
                if(map.containsKey(next+k)==true){
                    out+=1;
                }
            }
        }
        return out;
    }
}
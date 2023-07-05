class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int i,n=time.length,count=0;
        for(i=0;i<n;i++){
            int a=time[i]%60;
            int diff=(60-a)%60;
            if(map.containsKey(diff)==true){
                count+=map.get(diff);
                map.put(a,map.getOrDefault(a,0)+1);
            }
            else{
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        return count;
    }
}
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int n,m,i,j,total=0,l=0;
        n=nums.size();
        int[][] vis=new int[n][];
        int[] rowlen=new int[n];
        int maxr=0;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(i=0;i<n;i++){
            int lm=nums.get(i).size();
            total+=lm;
            
            for(j=0;j<lm;j++){
                int sum=i+j;
                maxr=Math.max(maxr,sum);
                ArrayList<Integer> list=map.getOrDefault(sum,new ArrayList<Integer>());
                list.add(nums.get(i).get(j));
                map.put(sum,list);
            }
        }
        
        int[] out=new int[total];
        for(i=0;i<=maxr;i++){
             ArrayList<Integer>list=map.get(i);    
            int al=list.size();
             int temp=al-1;
             for(temp=al-1;temp>=0;temp--){
                 out[l++]=list.get(temp);
             }
            
            
        }
        return out;
    }
}
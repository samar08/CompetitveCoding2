class Solution {
    public int equalPairs(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int i,j,count=0;
        HashMap<String,Integer> rset=new HashMap<String,Integer>();
        HashMap<String,Integer> cset=new HashMap<String,Integer>();
       
        for(i=0;i<m;i++){
            String arr="";
            for(j=0;j<n;j++){
                arr=arr+grid[i][j]+"-";
            }
            rset.put(arr,rset.getOrDefault(arr,0)+1);
            
        }
        for(j=0;j<n;j++){
            String arr="";
            for(i=0;i<m;i++){
                 arr=arr+grid[i][j]+"-";
            }
             cset.put(arr,cset.getOrDefault(arr,0)+1);
        }
        
        for(String val: rset.keySet()){
            if(cset.containsKey(val)==true){
                count+=(rset.get(val)*cset.get(val));
            }
        }
        return count;
        
    }
}
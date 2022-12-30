class Solution {
    public void bfs(int index,int target, List<Integer> temp,List<List<Integer>> out,int[][] graph){
        temp.add(index);
        if(index==target){
            List<Integer> outtemp=new ArrayList<Integer>();
            for(Integer val:temp){
                outtemp.add(val);
            }
            out.add(outtemp);
           
        }
        else{
            for(Integer v: graph[index]){
                
                bfs(v,target,temp,out,graph);
            }
           
        }
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> out=new ArrayList<List<Integer>>();
        
        int target=graph.length-1;
        for(Integer v: graph[0]){
            List<Integer>temp=new ArrayList<Integer>();
            temp.add(0);
            bfs(v,target,temp,out,graph);
        }
        
        return out;
    }
}
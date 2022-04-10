class DFS{
    // Function to return a list containing the DFS traversal of the graph.
    public void dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer>out){
        if(vis[v]==false){
            vis[v]=true;
            out.add(v);
            for(int node:adj.get(v)){
                //if(vis[node]==false){
                    dfs(node,adj,vis,out);
              //  }
            }
        }
        return;
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        ArrayList<Integer>out=new ArrayList<Integer>();
        boolean[] vis=new boolean[V];
        dfs(0,adj,vis,out);
        return out;
        
    }
}
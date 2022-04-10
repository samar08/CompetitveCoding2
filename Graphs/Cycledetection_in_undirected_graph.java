public class Cycledetection_in_undirected_graph {
    public boolean checkForCycle(int node, int parent, boolean vis[], ArrayList<ArrayList<Integer>> adj) {
        vis[node] = true; 
        for(Integer it: adj.get(node)) {
            if(vis[it] == false) {
                if(checkForCycle(it, node, vis, adj) == true) 
                    return true; 
            }
            else if(it!=parent) 
                return true; 
        }
        
        return false; 
    }
    // 0-based indexing Graph
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis[] = new boolean[V];
        
        for(int i= 0;i<V;i++) {
            if(vis[i] == false) {
                if(checkForCycle(i, -1, vis, adj))
                    return true; 
            }
        }
        
        return false; 
    }
}
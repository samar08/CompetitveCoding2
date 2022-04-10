class BFS {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer>que=new LinkedList<Integer>();
        que.add(0);
        ArrayList<Integer>out=new ArrayList<Integer>();
        boolean[]vis=new boolean[V];
       vis[0]=true;
        while(que.isEmpty()!=true){
            int node=que.remove();
            out.add(node);
             
            for(int v:adj.get(node)){
                if(vis[v]==false){
                    vis[v]=true;
                    que.add(v);
                }
            }
            
        }
        return out;
    }
}
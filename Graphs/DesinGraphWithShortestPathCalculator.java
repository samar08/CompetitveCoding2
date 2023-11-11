class Graph {
    HashMap<Integer,ArrayList<int[]>> map;
    int n;
    public Graph(int n, int[][] edges) {
        this.n=n;
        int i,m=edges.length,u,v,w;
            map=new HashMap<>();
            for(i=0;i<m;i++){
                u=edges[i][0];
                v=edges[i][1];
                w=edges[i][2];
                ArrayList<int[]> list=map.getOrDefault(u,new ArrayList<int[]>());
                list.add(new int[]{v,w});
                map.put(u,list);
            }

    }
    
    public void addEdge(int[] edge) {
        int u,v,w;
         u=edge[0];
         v=edge[1];
         w=edge[2];
         ArrayList<int[]> list=map.getOrDefault(u,new ArrayList<int[]>());
         list.add(new int[]{v,w});
         map.put(u,list);
    }
    
    public int shortestPath(int node1, int node2) {
        return dijkstras(node1, node2);
    }
    public int dijkstras(int node1, int node2){
        int i;
        int[] dist=new int[n];
        for(i=0;i<n;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[node1]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[1]>b[1]){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });
      
        
        pq.add(new int[]{node1,0});
        
        while(pq.isEmpty()!=true){
            int[] edges=pq.poll();
            int u=edges[0];
            int w=edges[1];
            ArrayList<int[]> list=map.get(u);
            int len;
            if(list==null){
                len=0;
            }
            else{
                len=list.size();
            }
            
            for(i=0;i<len;i++){
                if(dist[list.get(i)[0]]>dist[u]+list.get(i)[1]){
                    dist[list.get(i)[0]]=list.get(i)[1]+dist[u];
                    pq.add(list.get(i));
                }
                
            }
            
        }
        if(dist[node2]==Integer.MAX_VALUE){
            dist[node2]=-1;
        }
        return dist[node2];

    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
class Solution {
    
    private long bdfs(int i,int n,int[]vis,HashMap<Integer,ArrayList<Integer>> graph,int mapn){
        long count=0;
        if(vis[i]==0){
            Queue<Integer>st=new LinkedList<Integer>();
            st.add(i);
            while(st.isEmpty()==false){
                int l=st.poll();
                //System.out.println("l: "+l);
                vis[l]=mapn;
                
                 count+=1;
                ArrayList<Integer>ch=graph.get(l);
                if(ch!=null){
                    for(int e=0;e<ch.size();e++){
                    int child=ch.get(e);
                    if(vis[child]==0){
                        vis[child]=mapn;
                        st.add(child);
                    }
                
                }
                }
                
            }
            
        }
        return count;
    }
    public long countPairs(int n, int[][] edges) {
        
        int m=edges.length;
        if(m==0){
            return ((long)n*(long)(n-1))/2;
        }
        HashMap<Integer,ArrayList<Integer>> graph=new HashMap<Integer,ArrayList<Integer>>();
        long out=0;
        int i,j;
        for(i=0;i<m;i++){
            ArrayList<Integer> temp=graph.getOrDefault(edges[i][0],new ArrayList<Integer>());
            temp.add(edges[i][1]);
            graph.put(edges[i][0],temp);
            ArrayList<Integer> temp2=graph.getOrDefault(edges[i][1],new ArrayList<Integer>());
            temp2.add(edges[i][0]);
            graph.put(edges[i][1],temp2);
        }
       // System.out.println(graph);
       // HashMap<Integer,Long>map=new HashMap<Integer,Long>();
        int[] vis=new int[n];
        int mapn=1;
        //ArrayList<Long>outl=new ArrayList<Long>();
        long c=0;
        long count=0;
        for(i=0;i<n;i++){
            if(vis[i]==0){
            count=bdfs(i,n,vis,graph,mapn);
           // System.out.println(count);
            out+=c*count;
            c+=count;
          //  outl.add(count);
           // map.put(mapn,count);
            mapn+=1;
            }
        }
        graph=null;
        System.gc();
       // long[] outl=new long[mapn-1];
        // for(int y=0;y<mapn-1;y++){
        //     outl[y]=(long)map.get(y+1);
        //     System.out.println(outl[y]);
        // }
       // Arrays.sort(outl);
        // for(int y=0;y<mapn-1;y++){
        //     //outl[y]=(long)map.get(y+1);
        //     System.out.println(outl[y]);
        // }
        // for(int y=mapn-2;y>0;y--){
        //     for(int z=y-1;z>=0;z--){
        //         out+=(long)((long)outl.get(y)*(long)outl.get(z));
        //     }
        // }
        return out;
        
    }
}
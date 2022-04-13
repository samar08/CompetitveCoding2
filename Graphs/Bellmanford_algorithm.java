import java.util.*;
public class Bellmanford_algorithm {
    public static void bellmanford(ArrayList<ArrayList<Integer>> edges,int n){
        int[] dist=new int[n];
        int i;
        for(i=0;i<n-1;i++){
            for(ArrayList<Integer> it : edges){
              int u=it.get(0)-1; //0 based indexing
              int v=it.get(1)-1;
              int wt=it.get(2);
              if(dist[u]+wt<dist[v]){
                  dist[v]=dist[u]+wt;
              }
            }
        }
        for(ArrayList<Integer> it:edges){
            int u=it.get(0);
            int v=it.get(1);
            int wt=it.get(2);
            if(dist[u]+wt<dist[v]){
                System.out.println("there exists a negative cycle");
                return;
            }
        }
    }
}
 

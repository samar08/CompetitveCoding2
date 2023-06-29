import java.util.*;
public class Dijkstrasproblemgfg {
    public static void dijkstras(int st,HashMap<Integer,ArrayList<int[]>> map, int[] dist){
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b){
                if(a[1]>b[1]){
                    return 1;
                }
                else if(a[1]==b[1]){
                    if(a[0]>b[0]){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
            
        });
        pq.add(new int[]{0,0});
        while(pq.size()>0){
            int[] node=pq.poll();
            int u=node[0];
            int weight=node[1];
            if(dist[u]>weight){
                dist[u]=weight;
            }
            if(map.containsKey(u)==true){
                for(int[] edges: map.get(u)){
                int v=edges[0];
                int w2=edges[1];
                if(dist[v]>dist[u]+w2){
                    dist[v]=dist[u]+w2;
                    pq.add(new int[]{v,dist[v]});
                }
            }
            }
            
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int n=sc.nextInt();
        System.out.println("Enter number of edges: ");
        int m=sc.nextInt();
        int i,j;
        HashMap<Integer,ArrayList<int[]>> map=new HashMap<>();
        System.out.println("Enter edges: ");
        for(i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int weight=sc.nextInt();
            ArrayList<int[]> list = map.getOrDefault(u,new ArrayList<int[]>());
            int[] pair=new int[]{v,weight};
            list.add(pair);
            map.put(u,list);
        }
        int[] dist=new int[n];
        for(i=1;i<n;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dijkstras(0,map,dist);
        System.out.println("Shortest path from 0 node are ");
        for(i=0;i<n;i++){
            System.out.print(dist[i]+" ");
        }
    }
    
}

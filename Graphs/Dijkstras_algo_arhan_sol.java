import java.util.*;
public class Dijkstras_algo_arhan_sol {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        
        for(int i = 1; i <= n; i++)map.put(i, new HashMap<>());
        
        int[][] edges = new int[m][3];
        
        for(int i = 0; i < m; i++){
            edges[i][0] = scan.nextInt();
            edges[i][1] = scan.nextInt();
            edges[i][2] = scan.nextInt();
            
            map.get(edges[i][0]).put(edges[i][1], edges[i][2]);
            map.get(edges[i][1]).put(edges[i][0], edges[i][2]);
        }
        
        long[] dist = new long[n + 1];
        int[] parent = new int[n + 1];
        
        for(int i = 1; i < n + 1; i++)parent[i] = i;
        
        long maxDist = (long)Math.pow(10, 11) + 1; 
        Arrays.fill(dist, maxDist);
        dist[1] = 0;
        
        PriorityQueue<long[]> queue = new PriorityQueue<>(new Comparator<long[]>(){
            public int compare(long[] a, long[] b){
                if(a[1] > b[1])return 1;
                else if(a[1] == b[1])return 0;
                return -1;
            }
        });
        
        queue.add(new long[]{1, 0});
        
        while(queue.size() != 0){
            long[] poll = queue.poll();
            int u = (int)poll[0];
            Map<Integer, Integer> vMap = map.get(u);
            
            for(int v: vMap.keySet()){
                
                if(dist[v] > dist[u] + vMap.get(v)){
                    dist[v] = dist[u] + vMap.get(v);
                    queue.add(new long[]{v, dist[v]});
                    parent[v] = u;
                }
            }
            
        }
        
        if(dist[n] == maxDist)System.out.println(-1);
        else{
            List<Integer> list = new ArrayList<>();
            list.add(n);
            while(parent[n] != 1){
                n = parent[n];
                list.add(n);
            }
            list.add(1);
            
            for(int i = list.size() - 1; i >= 0; i--)System.out.print(list.get(i) + " ");   
        }
    }
}

import java.util.*;
import java.lang.*;
public class Dijkstras_algorithm {
    static class Pair{
        int node;
        int weight;
        Pair(int n,int w){
       this.node=n;
       this.weight=w;
        }
    }
    public static int findmin(int[] dist,int n,HashSet<Integer>set){
        int out=-1;
        int i;
        int mini=Integer.MAX_VALUE;
        for(i=0;i<n;i++){
            if(dist[i]<mini && (set.contains(i)==false)){
                mini=dist[i];
                out=i;
            }
        }
        return out;
    }    
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    int i,j,n,m;
    n=sc.nextInt();
    m=sc.nextInt();
    HashMap<Integer,ArrayList<Pair>>edges=new HashMap<Integer,ArrayList<Pair>>();
    for(i=0;i<m;i++){
        int a=sc.nextInt()-1;
        int b=sc.nextInt()-1;
        int w=sc.nextInt();
        Pair p=new Pair(b,w);
        Pair p2=new Pair(a,w);
        ArrayList<Pair>found=edges.getOrDefault(a, new ArrayList<Pair>());
        found.add(p);
        edges.put(a, found);
        ArrayList<Pair>found2=edges.getOrDefault(b, new ArrayList<Pair>());
        found2.add(p2);
        edges.put(b, found2);

    }
    int[] dist=new int[n];
    int[]parent=new int[n];
    for(i=0;i<n;i++){
        parent[i]=-1;
    }
    for(i=0;i<n;i++){
        if(i==0){
            dist[i]=0;
        }
        else{
            dist[i]=Integer.MAX_VALUE;
        }
    }
    HashSet<Integer>set=new HashSet<Integer>();
    int v;
    v=findmin(dist,n,set);
    while(v!=-1){
       set.add(v);
       ArrayList<Pair>adj=edges.getOrDefault(v,new ArrayList<Pair>());
       if(adj.size()>0){
       for(Pair x:adj){
           if(set.contains(x.node)==false){
               if(dist[v]+x.weight<dist[x.node]){
                   dist[x.node]=dist[v]+x.weight;
                   parent[x.node]=v;
               }
           }
       }
    }
       v=findmin(dist,n,set);
    }
    i=n-1;
    Stack<Integer>st=new Stack<Integer>();
    st.push(i);
    while(parent[i]!=-1){
       st.push(parent[i]);
       i=parent[i];
    }
    if(parent[i]==-1 && i!=0){
        System.out.println(-1);
    }
    else{
        while(st.isEmpty()==false){
            int x=st.pop();
            System.out.print((x+1)+" ");
        }
    }
    }
}

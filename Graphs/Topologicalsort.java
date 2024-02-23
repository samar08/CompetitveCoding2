public class Topologicalsort {
    static void dfs(int i,boolean[]vis,ArrayList<ArrayList<Integer>> adj,Stack<Integer> stack){
        vis[i]=true;
        for(int v:adj.get(i)){
            if(vis[v]==false){
                dfs(v,vis,adj,stack);
            }
        }
        stack.push(i);
        return;
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean[]vis=new boolean[V];
        int i;
        Stack<Integer>stack=new Stack<Integer>();
        for(i=0;i<V;i++){
            if(vis[i]==false){
                dfs(i,vis,adj,stack);
            }
        }
        int[]out=new int[V];
        int k=0;
        while(stack.isEmpty()==false){
            out[k]=stack.pop();
            k+=1;
        }
        return out;
    } 
}

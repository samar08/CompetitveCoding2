import java.util.*;
class Main {
    public static void dfs(int index, HashMap<Integer,ArrayList<Integer>> map,int[] visited, Stack<Integer>stack){
        visited[index]=1;
       // if(map.containsKey(index)==true){
            ArrayList<Integer> temp=map.getOrDefault(index,new ArrayList<Integer>());
            for(Integer i:temp){
                if(visited[i]==0)
                {
                    dfs(i,map,visited,stack);
                }
            }
       // }
        
        stack.push(index);
    }
    public static boolean cycleIsPresent(int index, HashMap<Integer,ArrayList<Integer>> map, int[] cycleVisited,int[] dfscycleVisited){
        cycleVisited[index]=1;
        dfscycleVisited[index]=1;
        boolean result=false;
        if(map.containsKey(index)==true){
            ArrayList<Integer> temp=map.get(index);
            for(Integer i: temp){
                if(cycleVisited[i]==0){
                    result=cycleIsPresent(i, map, cycleVisited,dfscycleVisited);
                    if(result==true){
                       
                    return true;
                    }
                    
                }
                else if(dfscycleVisited[i]==1){
                   return true;
                }
            }
        }
        dfscycleVisited[index]=0;
        return result;
    }
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int[] visited=new int[n+1];
        int[] dfscycleVisited=new int[n+1];
        int[] cycleVisited=new int[n+1];
        Stack<Integer>stack=new Stack<>();
      
        for(i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            ArrayList<Integer> temp=map.getOrDefault(u,new ArrayList<Integer>());
            temp.add(v);
            map.put(u,temp);
        }
        for(i=n;i>=1;i--){
            if(map.containsKey(i)==true){
                ArrayList<Integer> temp=map.get(i);
                Collections.sort(temp,Collections.reverseOrder());
                map.put(i,temp);
            }
        }
       
        for(i=n;i>=1;i--){
            if(cycleIsPresent(i,map,cycleVisited,dfscycleVisited)==true){
                System.out.println("Sandro fails.");
                System.exit(0);

            }
        }
      

        for(i=n;i>=1;i--){
            if(visited[i]==0){
                dfs(i,map,visited,stack);
            }
        }
        while(stack.isEmpty()==false){
            System.out.print(stack.pop()+" ");
        }
    }
}

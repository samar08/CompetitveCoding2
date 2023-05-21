class Solution {
    public void change(int[][] grid,int i,int j,int n,int p){
        if((i>=0 && i<n) && (j>=0 && j<n)){
            if(grid[i][j]==1){
                grid[i][j]=p;
                change(grid,i+1,j,n,p);
                change(grid,i,j+1,n,p);
                change(grid,i-1,j,n,p);
                change(grid,i,j-1,n,p);
            }
        }
        else{
            return;
        }
    }
    public void changeoneisland(int[][] grid,int n,int p){
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]==1){
                    change(grid,i,j,n,p);
                    return;
                }
            }
        }
    }
    public void dfs(int[][] grid,int i,int j,int c,int n,int[] out,int[][] vis){
        if((i>=0 && i<n) && (j>=0 && j<n)){
            if(grid[i][j]==0){
                grid[i][j]=3;
                c+=1;
                dfs(grid,i+1,j,c,n,out,vis);
                dfs(grid,i,j+1,c,n,out,vis);
                dfs(grid,i-1,j,c,n,out,vis);
                dfs(grid,i,j-1,c,n,out,vis);
                grid[i][j]=0;
                c-=1;
            }
            else if(grid[i][j]==1){
                out[0]=Math.min(out[0],c);
                System.out.println("c: "+c);
                System.out.println(out[0]);
            }
            else if(grid[i][j]==2){
                
                c=0;
                grid[i][j]=3;
                dfs(grid,i+1,j,c,n,out,vis);
                dfs(grid,i,j+1,c,n,out,vis);
                dfs(grid,i-1,j,c,n,out,vis);
                dfs(grid,i,j-1,c,n,out,vis);
                grid[i][j]=2;
                //vis[i][j]=0;
            }

        }
    }
    public void bfs(int[][]grid,Queue<Integer[]> que,int n,int[]out,int[][] vis){
        
        while(que.isEmpty()!=true){
            Integer[] vertex=que.remove();
            int x=(int)vertex[0];
            int y=(int)vertex[1];
            int cost=(int)vertex[2];
           // System.out.println("x: "+x+" y:"+y+" cost:"+cost);
            if(vis[x][y]==0){
                vis[x][y]=1;
                if(grid[x][y]==0 ){
                    //grid[x][y]=3;
                    cost+=1;
                    if(x+1<n){
                        que.add(new Integer[]{x+1,y,cost});
                    }
                    if(x-1>=0){
                        que.add(new Integer[]{x-1,y,cost});
                    }
                    if(y+1<n){
                        que.add(new Integer[]{x,y+1,cost});
                    }
                    if(y-1>=0){
                        que.add(new Integer[]{x,y-1,cost});
                    }
                }
                else if(grid[x][y]==1)
                {
                    out[0]=Math.min(out[0],cost);
                }
            }
           
        }
        for(int p=0;p<n;p++){
            for(int q=0;q<n;q++){
                vis[p][q]=0;
            }
        }
        
    }
    public int shortestBridge(int[][] grid) {
     int n=grid.length,i,j;
     changeoneisland(grid,n,2);
     int[]out=new int[]{Integer.MAX_VALUE};
     int[][]vis=new int[n][n];
     for(i=0;i<n;i++){
         for(j=0;j<n;j++){
             if(grid[i][j]==2){
                Queue<Integer[]>que=new LinkedList<Integer[]>();   
                vis[i][j]=1;         
                if(i+1<n)
                que.add(new Integer[]{i+1,j,0});
                if(i-1>=0)
                que.add(new Integer[]{i-1,j,0});
                if(j+1<n)
                que.add(new Integer[]{i,j+1,0});
                if(j-1>=0)
                que.add(new Integer[]{i,j-1,0});
                bfs(grid,que,n,out,vis);
             }
         }
     }
    //  for(i=0;i<n;i++){
    //      for(j=0;j<n;j++){
    //          System.out.print(grid[i][j]+" ");
    //      }
    //      System.out.println();
    //  }
     return out[0];
    }
}
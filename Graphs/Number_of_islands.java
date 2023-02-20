class Solution {
    public void bfs(int i,int j,char[][] grid,int[][] vis,int m,int n)
    {
        if(i<0 || i>=m || j<0 || j>=n){
            return;
        }
        if(vis[i][j]==0 && grid[i][j]=='1'){
            grid[i][j]='0';
            vis[i][j]=1;
            bfs(i,j+1,grid,vis,m,n);
            bfs(i+1,j,grid,vis,m,n);
            bfs(i-1,j,grid,vis,m,n);
            bfs(i,j-1,grid,vis,m,n);
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length,i,j,count=0;
        int[][] vis=new int[m][n];
       for(i=0;i<m;i++){
           for(j=0;j<n;j++){
               if(grid[i][j]=='1'){
                   bfs(i,j,grid,vis,m,n);
                   count++;
               }
           }
       }
     return count;
        
    }
}

class Floodfill {
    public void dfs(int x,int y,int[][]image,int color,int newcolor,int m,int n,boolean[][]vis){
        if(x<0 || y<0 || x>=m || y>=n || image[x][y]!=color || vis[x][y]==true){
            return;
        }
        image[x][y]=newcolor;
        vis[x][y]=true;
        dfs(x+1,y,image,color,newcolor,m,n,vis);
        dfs(x,y+1,image,color,newcolor,m,n,vis);
        dfs(x-1,y,image,color,newcolor,m,n,vis);
        dfs(x,y-1,image,color,newcolor,m,n,vis);
        
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int i,j;
        int m=image.length;
        int n=image[0].length;
        boolean[][]vis=new boolean[m][n];
        int color=image[sr][sc];
        
        dfs(sr,sc,image,color,newColor,m,n,vis);
        return image;
    }
}
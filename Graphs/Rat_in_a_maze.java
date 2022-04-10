class Solution {
    public static void bfs(int x,int y,int[][]m,int n,String sb,ArrayList<String>out,boolean[][]vis){
        if(x<0 || x>=n || y<0 || y>=n || vis[x][y]==true){
            return;
        }
        vis[x][y]=true;
        if(m[x][y]==0){
            return;
        }
        if(x==n-1 && y==n-1){
           // String s=sb.toString();
            out.add(sb);
        }
        if(x+1<n && m[x+1][y]!=0){
            //sb.append('D');
            String news=sb+'D';
            //sb+='D';
            bfs(x+1,y,m,n,news,out,vis);
            
        }
        //sb.deleteCharAt(sb.length()-1);
       if(y+1<n && m[x][y+1]!=0){
           //sb.append('R');
          // sb+='R';
          String news=sb+'R';
           bfs(x,y+1,m,n,news,out,vis);
       }
      // sb.deleteCharAt(sb.length()-1);
       if(x-1>=0 && m[x-1][y]!=0){
           //sb.append('U');
           //sb+='U';
           String news=sb+'U';
           bfs(x-1,y,m,n,news,out,vis);
       }
       //sb.deleteCharAt(sb.length()-1);
       if(y-1>=0 && m[x][y-1]!=0){
           //sb.append('L');
           //sb+='L';
           String news=sb+'L';
           bfs(x,y-1,m,n,news,out,vis);
       }
       //sb.deleteCharAt(sb.length()-1);
       vis[x][y]=false;
       return;
       
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String>out=new ArrayList<String>();
        boolean[][] vis=new boolean[n][n];
        if(m[0][0]==0 || m[n-1][n-1]==0){
            return out;
        }
        //StringBuilder sb=new StringBuilder();
        String sb="";
        bfs(0,0,m,n,sb,out,vis);
        return out;
    }
}

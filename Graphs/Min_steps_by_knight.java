class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public int bfs(int x,int y,boolean[][]vis,int d,int N,int tx,int ty){
       
        Queue<int[]>que=new LinkedList<>();
        que.add(new int[]{x,y,d});
        int[][] arr={{2,1},{2,-1},{1,2},{1,-2},{-2,-1},{-1,-2},{-1,2},{-2,1}};
        vis[x][y]=true;
        while(que.isEmpty()==false){
            //d+=1;
            int[] point=que.poll();
          
           d=point[2];
            if(point[0]==tx && point[1]==ty){
                return d;
            }
             d=d+1;
            x=point[0];
            y=point[1];
            for(int[] move:arr){
                if((x+move[0]<N && x+move[0]>=0) && (y+move[1]<N && y+move[1]>=0)){
                 if(vis[x+move[0]][y+move[1]]==false){
                     vis[x+move[0]][y+move[1]]=true;
                     que.add(new int[]{x+move[0],y+move[1],d});
                 }
                    
                }
        }
        }
        
        return Integer.MAX_VALUE;
    }
    public int minStepToReachTarget(int kp[], int tp[], int N)
    {
        // Code here
        boolean[][]vis=new boolean[N][N];
        int[][] dist=new int[N][N];
        int i,j;
        if(kp[0]==tp[0] && kp[1]==tp[1]){
            return 0;
        }
        kp[0]=kp[0]-1;
        kp[1]=kp[1]-1;
        tp[0]=tp[0]-1;
        tp[1]=tp[1]-1;
        
        return bfs(kp[0],kp[1],vis,0,N,tp[0],tp[1]);
     
    }
}
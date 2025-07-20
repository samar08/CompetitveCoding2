import java.util.*;
public class Labyrinth {

    static int mindis=Integer.MAX_VALUE;
    static String out="";
    static boolean flag=false;
public static void backtrack(int x,int y,char[][]steps,Stack<Character>ans){
    if(steps[x][y]=='D'){
        ans.add('D');
        backtrack(x-1,y,steps,ans);
    }
    else if(steps[x][y]=='R'){
        ans.add('R');
        backtrack(x,y-1,steps,ans);
    }
    else if(steps[x][y]=='U'){
        ans.add('U');
        backtrack(x+1,y,steps,ans);
    }
    else if(steps[x][y]=='L'){
        ans.add('L');
        backtrack(x,y+1,steps,ans);
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,j;
        char[][] mat=new char[n][m];
        char[][]steps=new char[n][m];
        int[][] vis=new int[n][m];
        Stack<Character>ans=new Stack<>();
Queue<int[]>q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        //String temp="";
        for(i=0;i<n;i++){
           String row= sc.next();
           for(j=0;j<m;j++){
               mat[i][j]=row.charAt(j);
           }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){

                if(mat[i][j]=='A'){
                    int[] node=new int[]{i,j};
                    node[0]=i;
                    node[1]=j;
                    q.add(node);
                    break;
                }
            }
        }
        int val=0;
        while(q.isEmpty()==false){
            int[] node=q.poll();
            //val++;
            int x=node[0];
            int y=node[1];
            if(vis[x][y]==1){
                continue;
            }
            vis[x][y]=1;
            if(mat[x][y]=='B'){
                flag=true;
//                for(i=0;i<n;i++){
//                    for(j=0;j<m;j++){
//                        System.out.print(steps[i][j]);
//                    }
//                    System.out.println();
//                }
                backtrack(x,y,steps,ans);
           // mindis=val;
             //   out=sb.toString();
                break;
            }
            if((x+1<=n-1) && (mat[x+1][y]!='#') &&(vis[x+1][y]==0)){
                steps[x+1][y]='D';
                q.add(new int[]{x+1,y});
                //sb.append("")
            }
            if((y+1<=m-1) && (mat[x][y+1]!='#') &&(vis[x][y+1]==0)){
                steps[x][y+1]='R';
                q.add(new int[]{x,y+1});
            }
            if((x-1>=0) && (mat[x-1][y]!='#') &&(vis[x-1][y]==0)){
                steps[x-1][y]='U';
                q.add(new int[]{x-1,y});
            }
            if((y-1>=0) && (mat[x][y-1]!='#') &&(vis[x][y-1]==0)){
                steps[x][y-1]='L';
                q.add(new int[]{x,y-1});
            }

        }


        if(flag==true){
            System.out.println("YES");
            System.out.println(ans.size());
while(ans.isEmpty()==false){
    System.out.print(ans.pop());
}
            //System.out.println(mindis);
           // System.out.println(out);
        }
        else{
            System.out.println("NO");
        }

    }
}

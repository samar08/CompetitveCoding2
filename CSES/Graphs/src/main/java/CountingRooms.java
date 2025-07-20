import java.util.*;
public class CountingRooms {
    public static void dfs(int i,int j,int n,int m,char[][] mat){
        if(i<0 || j<0 || i>=n || j>=m){
            return;
        }
        if(mat[i][j]=='#'){
            return;
        }
        if(mat[i][j]=='.'){
            mat[i][j]='#';
            dfs(i+1,j,n,m,mat);
            dfs(i,j+1,n,m,mat);
            dfs(i-1,j,n,m,mat);
            dfs(i,j-1,n,m,mat);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,j;
        char[][] mat=new char[n][m];
        for(i=0;i<n;i++){
            String row=sc.next();
            for(j=0;j<m;j++) {
                mat[i][j] = row.charAt(j);
            }
        }
        int count=0;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(mat[i][j]=='.'){
                    dfs(i,j,n,m,mat);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

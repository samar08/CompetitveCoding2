import java.util.*;
import java.lang.*;
public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E) {
    int n=A.size();
    int m=A.get(0).size();
    int p=B.size();
    int i,j,k;
    int[][]dp=new int[n][m];
    int longint=(int)Math.pow(10,9)+7;
  
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            if(j==0){
                dp[i][j]=(A.get(i).get(j))%longint;
            }
            else{
                dp[i][j]=((dp[i][j-1])%longint+(A.get(i).get(j))%longint)%longint;
            }
        }
    }

    for(j=0;j<m;j++){
        for(i=0;i<n;i++){
            if(i!=0){
            dp[i][j]=((dp[i-1][j])%longint+(dp[i][j])%longint)%longint;
            }
        }
    }
    ArrayList<Integer>out=new ArrayList<Integer>();
    for(k=0;k<p;k++)
    {
        int x1=B.get(k)-1,y1=C.get(k)-1,x2=D.get(k)-1,y2=E.get(k)-1;
        if(B.get(k)==D.get(k) && C.get(k)==E.get(k)){
            int ans=A.get(B.get(k)-1).get(C.get(k)-1);
            while(ans<0){
                ans+=longint;
            }
            out.add((ans)%longint);
        }
        else if(B.get(k)-1==0 && C.get(k)-1==0){
            int ans=(dp[D.get(k)-1][E.get(k)-1])%longint;
            while(ans<0){
                ans+=longint;
            }
            out.add((ans)%longint);
           
        }
        else if(B.get(k)-1!=0 && C.get(k)-1!=0){
            int ans=((dp[x2][y2])%longint-(dp[x1-1][y2])%longint-(dp[x2][y1-1])%longint+(dp[x1-1][y1-1])%longint)%longint;
          while(ans<0){
                ans+=longint;
            }
            out.add((ans)%longint);
         
        }
        else if(x1==0 && y1!=0){
            int ans=((dp[x2][y2])%longint-(dp[x2][y1-1])%longint)%longint;
            while(ans<0){
                ans+=longint;
            }
            out.add((ans)%longint);
         
        }
        else if(x1!=0 && y1==0){
            int ans=((dp[x2][y2])%longint-(dp[x1-1][y2])%longint)%longint;
            while(ans<0){
                ans+=longint;
            }
            out.add((ans)%longint);
           
        }

    }
    return out;
    }
}

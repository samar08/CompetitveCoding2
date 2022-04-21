public class Solution {
    public int submatrix_sum(ArrayList<ArrayList<Integer>> A,int x1,int y1,int x2,int y2,int[][] dp){
    
    int ans=0;
    int longint=(int)Math.pow(10,9)+7;
        if((x1==x2) && (y1==y2)){
            ans=A.get(x1).get(y1);
            // while(ans<0){
            //     ans+=longint;
            // }
            // out.add((ans)%longint);
        }
        else if(x1==0 && y1==0){
            ans=(dp[x2][y2])%longint;
            // while(ans<0){
            //     ans+=longint;
            // }
            // out.add((ans)%longint);
           
        }
        else if(x1!=0 && y1!=0){
            ans=((dp[x2][y2])%longint-(dp[x1-1][y2])%longint-(dp[x2][y1-1])%longint+(dp[x1-1][y1-1])%longint)%longint;
        //   while(ans<0){
        //         ans+=longint;
        //     }
        //     out.add((ans)%longint);
         
        }
        else if(x1==0 && y1!=0){
            ans=((dp[x2][y2])%longint-(dp[x2][y1-1])%longint)%longint;
            // while(ans<0){
            //     ans+=longint;
            // }
            // out.add((ans)%longint);
         
        }
        else if(x1!=0 && y1==0){
           ans=((dp[x2][y2])%longint-(dp[x1-1][y2])%longint)%longint;
            // while(ans<0){
            //     ans+=longint;
            // }
            // out.add((ans)%longint);
           
        }

    
    return ans;
    }
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
    int n=A.size();
    int m=A.get(0).size();
      int longint=(int)Math.pow(10,9)+7;
    int i,j,k;
    int[][]dp=new int[n][m];
   
    int x1=0,x2=0,y1=0,y2=0;
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
    int maxi=Integer.MIN_VALUE;
    for(i=0;i<=n-B;i++){
        for(j=0;j<=n-B;j++){
          x1=i;
          y1=j;
          x2=x1+B-1;
          y2=y1+B-1;
          maxi=Math.max(maxi,submatrix_sum(A,x1,y1,x2,y2,dp));
        }
    }
    return maxi;

    }
}

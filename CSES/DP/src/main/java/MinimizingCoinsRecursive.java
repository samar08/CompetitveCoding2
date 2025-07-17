import java.util.*;
public class MinimizingCoinsRecursive {
    public static int solve(int x, int[] coins, int n,int[] dp){
        if(x<0){
            return Integer.MAX_VALUE;
        }
        else if(x==0){
            return 0;
        }
        else{
            if(dp[x]!=-2){
                return dp[x];
            }
            int i,out=Integer.MAX_VALUE;
            for(i=0;i<n;i++){
                System.out.println("x: "+(x-coins[i]));
                int temp=solve(x-coins[i],coins,n,dp);
                if(temp==Integer.MAX_VALUE){
                    out=Math.min(out,temp);
                }
                else{
                    out=Math.min(temp+1,out);
                }

            }
            dp[x]=out;
            return out;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int i;
        int[] coins=new int[n];
        int[] dp=new int[x+1];
        for(i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        for(i=0;i<=x;i++){
            dp[i]=-2;
        }
        int out=solve(x,coins,n,dp);
        if(out==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(out);
        }
    }
}

import java.util.*;

public class MinimizingCoinsWithShowCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int i,j;
        int[] coins=new int[n];
        int[] dp=new int[x+1];
        int[] first=new int[x+1];
        for(i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        dp[0]=0;
        for(i=1;i<=x;i++){
            dp[i]=Integer.MAX_VALUE;
            for(j=0;j<n;j++){
                if(i-coins[j]>=0 && dp[i-coins[j]]+1<dp[i]){
                    if(dp[i-coins[j]]==Integer.MAX_VALUE){
                        dp[i]=dp[i-coins[j]];
                    }
                    else{
                        dp[i]=dp[i-coins[j]]+1;
                    }

                    first[i]=coins[j];
                }
            }
        }

        while(x>0){
            System.out.print(first[x]+" ");
            x-=first[x];
        }
    }
}

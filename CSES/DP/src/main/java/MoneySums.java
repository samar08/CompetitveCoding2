import java.util.*;
public class MoneySums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins=new int[n+1];
        int i,j;
        int sumi=0;
        for(i=0;i<n;i++){
            coins[i+1]=sc.nextInt();
            sumi+=coins[i+1];
        }
        Arrays.sort(coins);
       // int maxvalue=maxi*n;
        boolean[][]dp=new boolean[n+1][sumi+1];
        dp[0][0]=true;
        for(j=1;j<=n;j++){
            for(i=0;i<=sumi;i++){

                if(i-coins[j]>=0){
                    dp[j][i]=dp[j-1][i] | dp[j-1][i-coins[j]];
                }
                else{
                    dp[j][i]=dp[j-1][i];
                }


            }
        }
        StringBuilder sb=new StringBuilder();
        int cout=0;
        for(i=1;i<=sumi;i++){
            if(dp[n][i]==true){
               // System.out.print(i+" ");
                sb.append(i);
                sb.append(" ");
                cout++;
            }

        }
        String out=sb.toString();
        out.trim();
        System.out.println(cout);
        System.out.println(out);

    }
}

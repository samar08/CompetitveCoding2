import java.util.*;
public class CoinCombinations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int i,j;
        int[] coins=new int[n];
        int maxi=1000000007;
        for(i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        Arrays.sort(coins);
        int[] dp=new int[x+1];
        dp[0]=1;
        for(i=1;i<=x;i++){
            for(j=0;j<n;j++){
                if(i-coins[j]>=0){
                   // dp[i]=(dp[i]%maxi+dp[i-coins[j]]%maxi)%maxi;
                    dp[i]+=dp[i-coins[j]];
                    if(dp[i]>maxi){
                        dp[i]-=maxi;
                    }
                    //dp[i]=dp[i]%maxi;
                }


            }
        }
        if(dp[x]==maxi){
            System.out.println(0);
        }
        else{
            System.out.println(dp[x]);
        }

    }
}
//import java.io.*;
//import java.util.*;
//
//public class CoinCombinations{
//    static BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//    static PrintWriter pw = new PrintWriter(System.out);
//
//    public static void main(String[] args) throws IOException {
//        StringTokenizer st = new StringTokenizer(r.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int x = Integer.parseInt(st.nextToken());
//        int M = 1000000007;
//        st = new StringTokenizer(r.readLine());
//        int[] coins = new int[n];
//        for (int i = 0; i < n; i++) { coins[i] = Integer.parseInt(st.nextToken()); }
//        Arrays.sort(coins);
//
//        int[] dp = new int[x + 1];
//        dp[0] = 1;
//        for (int i = 1; i < dp.length; i++) {
//            dp[i] = 0;
//            for (int j = 0; j < n; j++) {
//                if (coins[j] > i) { break; }
//                dp[i] += dp[i - coins[j]];
//
//                // need to use -= M to pass for Java instead of %= M (which
//                // works in c++) to save time this is the same thing as dp[i] %
//                // m within the constraints of this problem (dp[i] can never be
//                // > 2*M since we are only adding) This wouldn't be a problem in
//                // USACO contests since USACO gives 2x time for java, but CSES
//                // doesn't dp[i] %= m;
//                if (dp[i] > M) dp[i] -= M;
//            }
//        }
//        if(dp[x]==M){
//            dp[x]=0;
//        }
//        pw.println(dp[x]);
//        pw.close();
//    }
//}
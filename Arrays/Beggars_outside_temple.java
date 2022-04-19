public class Solution {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        int[]dp=new int[A+1];
        int i,j;
        int n=B.size();
        for(i=0;i<n;i++){
            dp[B.get(i).get(0)-1]+=B.get(i).get(2);
            dp[B.get(i).get(1)]-=B.get(i).get(2);
        }
        ArrayList<Integer>out=new ArrayList<Integer>();
        out.add(dp[0]);
        int sumi=dp[0];
        for(i=1;i<A;i++){
          dp[i]=dp[i-1]+dp[i];
          out.add(dp[i]);
        }
        return out;
    }
}

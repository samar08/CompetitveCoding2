public class Solution {
    public int solve(int n) {
        if(n==1){
            return 1;
        }
        int p=1;
        int k=(int)Math.pow(2,1);
        while(k<=n){
            k=k*2;
        }
        k=k>>1;
        return k;

    }
}


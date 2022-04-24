public class Solution {
    public int solve(int A) {
        int ans=0;
        int pow=1;
        while(A>0){
            pow=pow*5;
            if((A&1)==1){
                ans+=pow;
            }
            A=A>>1;
        }
        return ans;
    }
}

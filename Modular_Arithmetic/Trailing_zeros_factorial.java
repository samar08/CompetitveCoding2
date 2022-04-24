public class Solution {
    public int trailingZeroes(int A) {
        int n=A;
        int b=5;
        int res=0;
        while(Math.floor(n/b)>0){
            res+=Math.floor(n/b);
            b=b*5;
        }
        return res;
    }
}


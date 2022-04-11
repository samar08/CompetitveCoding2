public class Solution {
    public int gcd(int A, int B) {
        if(A==0){
            return B;
        }
        int op=gcd(B%A,A);
        return op;
    }
}


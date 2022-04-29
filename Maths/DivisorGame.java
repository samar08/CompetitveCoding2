public class Solution {
    public long gcd(int A,int B){
        if(A==0){
            return (long)B;
        }
        return gcd(B%A,A);
    }
    public int solve(int A, int B, int C) {
        long i=1;
        int count=0;
        long lcm=(long)(B*C)/gcd(B,C);
        i=lcm;
        while(i<=A){
            if((i%B==0) && (i%C==0)){
                count+=1;
            }
            i+=lcm;
        }
        return count;
    }

}

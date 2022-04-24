public class Solution {
    public long fact(int B,long p){
        if(B<=1){
            return (long)1;
        }
        int i;
        long ans=1;
        for(i=1;i<=B;i++){
          ans=((ans%p)*(i%p))%p;
        }
        return ans;
    }
    public int solve(int A, int B) {
        long ans=1;
         long m=(long)Math.pow(10,9)+7;
        long b=fact(B,m-1);
        //System.out.println("before b "+b);
       
        long a=(long)A;
        long x=b%(m-1);
        b=x;
          //System.out.println("after b "+b);
        a=a%m;
        while(b>0){
            if((b&1)==1){
                ans=(ans*a)%m;
            }
            a=(a*a)%m;
            b=b>>1;
        }
        ans=ans%m;
        return (int)ans;
    }
}

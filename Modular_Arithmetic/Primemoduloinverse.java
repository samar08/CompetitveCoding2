import java.lang.*;
public class Solution {
    public int solve(int A, int B) {
     long ans=1;
     int m=B;
     int b=B-2;
     long a=(long)A;
     //fast power function
     a=a%m;
     while(b>0){
         if((b&1)==1){
             ans=(ans*a)%m;
         }
         a=(a*a)%m;
         b=b>>1;
     }
     return (int)ans;
    }
}
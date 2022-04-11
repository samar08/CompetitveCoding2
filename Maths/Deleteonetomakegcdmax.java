import java.util.*;
import java.lang.*;
public class Solution {
    public int gcd(int x,int y){
        if(x==0){
            return y;
        }
        else{
            int op=gcd(y%x,x);
            return op;
        }
    }
    public int solve(ArrayList<Integer> A) {
        int n=A.size();
        int[]left=new int[n];
        int[] right=new int[n];
        int i;
        for(i=0;i<n;i++){
            if(i==0){
                left[i]=A.get(i);
            }
            else{
                left[i]=gcd(A.get(i),left[i-1]);
            }
        }
        for(i=n-1;i>=0;i--){
            if(i==n-1){
                right[i]=A.get(i);
            }
            else{
                right[i]=gcd(A.get(i),right[i+1]);
            }
        }
        int maxgcd=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
           if(i==0){
              maxgcd=Math.max(maxgcd,right[i+1]);
           }
           else if(i==n-1){
               maxgcd=Math.max(maxgcd,left[i-1]);
           }
           else{
               maxgcd=Math.max(maxgcd,gcd(left[i-1],right[i+1]));
           }


        }
        return maxgcd;
    }

}

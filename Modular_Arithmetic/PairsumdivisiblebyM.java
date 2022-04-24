import java.util.*;
import java.lang.*;
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n=A.size();
        int i,j;
        long count=0;
        long[] rem=new long[B];
        long mod=(long)Math.pow(10,9)+7;
        for(i=0;i<n;i++){
            rem[A.get(i)%B]+=(long)1;
        }
        int mid=(int)B/2;
        i=0;
        j=B-mid;
        for(i=0;i<=mid;i++){
            if(i==0 || i==j){
                count+=(long)(rem[i]*(rem[i]-1)/2);
            }
            else{
                count+=(rem[i]*rem[B-i]);
            }
        }
        count=count%mod;
        return (int)count;
        
    }
}


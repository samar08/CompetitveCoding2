import java.util.*;
import java.lang.*;
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n=A.size();
        int i,j;
        long sum=0;
        long mod=(long)Math.pow(10,9)+7;
        HashMap<Long,Long>map=new HashMap<Long,Long>();
        for(i=0;i<n;i++){
            map.put((long)A.get(i),map.getOrDefault((long)A.get(i),(long)0)+(long)1);
        }
        for(long key1:map.keySet()){
            for(long key2:map.keySet()){
                long m=key1%key2;
               long p= ((m)%mod)*(map.get(key1)%mod)*(map.get(key2)%mod);
               sum=sum+p;
            }
        }
        sum=sum%mod;
        return (int)sum;

    }
}


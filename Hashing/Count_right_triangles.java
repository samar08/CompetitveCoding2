import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        long maxi=(long)Math.pow(10,9)+7;
        int i,j;
        HashMap<Integer,Integer>mx=new HashMap<Integer,Integer>();
         HashMap<Integer,Integer>my=new HashMap<Integer,Integer>();
         int n=A.size();
         for(i=0;i<n;i++){
             mx.put(A.get(i),mx.getOrDefault(A.get(i),0)+1);
             my.put(B.get(i),my.getOrDefault(B.get(i),0)+1);
         }
         long sum=0;
         for(i=0;i<n;i++){
             int a=mx.get(A.get(i));
             int b=my.get(B.get(i));
            long pro=(a-1)*(b-1);
            sum=(sum%maxi+pro%maxi)%maxi;
         }
         return (int)sum;

    }
}

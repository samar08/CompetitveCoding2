import java.lang.*;
import java.util.*;
public class Solution {
    public int solve(ArrayList<Integer> A) {
     int maxi=Integer.MIN_VALUE;
     int mini=Integer.MAX_VALUE;
     int i,j,n=A.size();
     int maxindex=0;
     int minindex=0;
     for(i=0;i<n;i++){
      if(A.get(i)>maxi){
          maxi=A.get(i);
      }
      if(A.get(i)<mini){
          mini=A.get(i);
      }

     }
     ArrayList<Integer>maxindices=new ArrayList<Integer>();
     ArrayList<Integer>minindices=new ArrayList<Integer>();
     for(i=0;i<n;i++){
         if(A.get(i)==maxi){
             maxindices.add(i);
         }
         if(A.get(i)==mini){
             minindices.add(i);
         }
     }
     int res=Integer.MAX_VALUE;
     for(int mx:maxindices){
         for(int minx:minindices){
           res=Math.min(res,Math.abs(mx-minx)+1);
         }
     }
     return res;

    }
}


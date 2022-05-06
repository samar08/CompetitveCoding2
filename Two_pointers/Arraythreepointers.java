import java.util.*;
import java.lang.*;
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
    int i=0,j=0,k=0;
    int n1=A.size(),n2=B.size(),n3=C.size();
    int mini=Integer.MAX_VALUE;
    
    while(i<n1 && j<n2 && k<n3){
        mini=Math.min(mini,Math.max(Math.abs(A.get(i)-B.get(j)),Math.max(Math.abs(B.get(j)-C.get(k)),Math.abs(C.get(k)-A.get(i)))));
         if(A.get(i)<=B.get(j) && A.get(i)<=C.get(k)){
             i+=1;
         }
         else if(B.get(j)<=A.get(i) && B.get(j)<=C.get(k)){
             j+=1;
         }
         else{
             k+=1;
         }
    }
    return mini;
    }
}


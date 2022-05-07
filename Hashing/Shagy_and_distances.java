import java.util.*;
import java.lang.*;
public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int i,n=A.size();
        boolean found=false;
        int dist=Integer.MAX_VALUE;
        for(i=0;i<n;i++){
            if(map.containsKey(A.get(i))){
                found=true;
                dist=Math.min(dist,Math.abs(i-map.get(A.get(i))));
                map.put(A.get(i),i);
            }
            else{
                map.put(A.get(i),i);
            }
        }
        if(found==true)
        return dist;
        else
        return -1;
    }
}

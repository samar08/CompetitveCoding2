import java.util.*;
import java.lang.*;
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i,n=A.size(),j;
        int m=B.size();
        ArrayList<Integer>out=new ArrayList<Integer>();
        ArrayList<Integer>last=new ArrayList<Integer>();
        Collections.sort(A);
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(i=0;i<n;i++){
            map.put(A.get(i),map.getOrDefault(A.get(i),0)+1);
        }
        for(i=0;i<m;i++){
            if(map.containsKey(B.get(i))){
                int times=map.get(B.get(i));
                for(j=0;j<times;j++){
                    out.add(B.get(i));
                    map.put(B.get(i),map.get(B.get(i))-1);
                }
            }
        }
        for(i=0;i<n;i++){
            if(map.get(A.get(i))>0){
                int times=map.get(A.get(i));
                for(j=0;j<times;j++){
                    out.add(A.get(i));
                     map.put(A.get(i),map.get(A.get(i))-1);
                }
            }
        }
        return out;

    }
}

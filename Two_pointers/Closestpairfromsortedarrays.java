import java.util.*;
import java.lang.*;
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int n1=A.size();
        int n2=B.size();
        ArrayList<Integer>out=new ArrayList<Integer>();
        int i=0;int j=n2-1;
        int x=0;int y=0;
        int mini=Integer.MAX_VALUE;
        while(i<n1 && j>=0){
            if(mini>Math.abs(A.get(i)+B.get(j)-C)){
                mini=Math.abs(A.get(i)+B.get(j)-C);
                x=i;
                y=j;
            }
            else if(mini==Math.abs(A.get(i)+B.get(j)-C)){
                if(i<x){
                    x=i;
                    y=j;
                }
                else if(i==x && j<y){
                    x=i;
                    y=j;
                }
            }
           
           if(A.get(i)+B.get(j)>C){
               j--;
           }
           else if(A.get(i)+B.get(j)<C){
               i++;
           }
           else{
               i++;
               j--;
           }

        }
        out.add(A.get(x));
        out.add(B.get(y));
        return out;
    }
}

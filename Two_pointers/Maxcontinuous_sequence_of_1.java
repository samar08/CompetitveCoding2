import java.util.*;
import java.lang.*;
public class Solution {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        int i,n=A.size();
        int low=0;
        int high=0;
        i=0;
        int temp=B;
        int lowindex=0;
        int highindex=0;
        int maxi=Integer.MIN_VALUE;
        while(high<n){
            if(A.get(high)==1){
                high++;
                
            }
            else if(A.get(high)==0){
                if(temp>0){
                    high++;
                    temp--;
                }
                else{
                    if(maxi<(high-low)){
                        maxi=high-low;
                        lowindex=low;
                        highindex=high;
                    }
                    //maxi=Math.max(maxi,high-low);
                    while(A.get(low)!=0){
                        low++;
                    }
                    low++;
                    //temp++;
                    high++;
                }
            }
        }
        if(maxi<high-low){
            maxi=high-low;
            lowindex=low;
            highindex=high;
        }
        //maxi=Math.max(maxi,high-low);
        ArrayList<Integer>out=new ArrayList<Integer>();
        for(i=lowindex;i<highindex;i++)out.add(i);
        return out;
    
    
    }
}

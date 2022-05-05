import java.util.*;
import java.lang.*;
public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        int n=A.size();
        if(n==1){
            return 0;
        }
        int low=0;
        int high=n-1;
        int maxarea=Integer.MIN_VALUE;
        int area=0;
        while(low<high){
            area=(high-low)*((int)Math.min(A.get(low),A.get(high)));
            maxarea=Math.max(area,maxarea);
            if(A.get(low)<A.get(high)){
                low++;
            }
            else if(A.get(low)>A.get(high)){
                high--;
            }
            else{
                low++;
                high--;
            }
        }
        return maxarea;
    }
}

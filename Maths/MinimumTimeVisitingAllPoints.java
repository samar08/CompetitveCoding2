import java.lang.*;
import java.util.*;
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int i,n=points.length,sum=0;
        for(i=1;i<n;i++){
            int x=Math.abs(points[i][0]-points[i-1][0]);
            int y=Math.abs(points[i][1]-points[i-1][1]);
            sum+=Math.max(x,y);
           
        }
        return sum;
    }
}
import java.util.*;
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int i,n=rocks.length;
        int[] spaceleft=new int[n];
        for(i=0;i<n;i++){
            spaceleft[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(spaceleft);
        int count=0,k=0;
        while(k<n && spaceleft[k]<=additionalRocks){
            additionalRocks-=spaceleft[k];
            count+=1;
            k+=1;
            
        }
        return count;

    }
}

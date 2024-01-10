import java.util.*;
class Solution {
    public int trap(int[] height) {
        int i,n=height.length;
     int[] rightmax=new int[n];
     int[] leftmax= new int[n];
     int trappedWater=0;
     for(i=0;i<n;i++){
         if(i==0){
             leftmax[i]=height[i];
         }
         else{
             leftmax[i]=Math.max(leftmax[i-1],height[i]);
         }
     }
     for(i=n-1;i>=0;i--){
         if(i==n-1){
             rightmax[i]=height[i];
         }
         else{
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
         }
     }
     for(i=0;i<n;i++){
        trappedWater+= Math.min(leftmax[i],rightmax[i])-height[i];

     }
     return trappedWater;

    }
}
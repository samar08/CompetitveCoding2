import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {

     int low,high,n=nums.length,i=n-1,out=0,mini=Integer.MAX_VALUE,req=0,diff=0;
     Arrays.sort(nums);
     int sumx=0;
     for(i=n-1;i>1;i--){
         low=0;
         high=i-1;
         req=target-nums[i];
         while(low<high){
             sumx=nums[low]+nums[high];
             if(nums[low]+nums[high]==req){
                 return target;
             }
             else if(nums[low]+nums[high]>req){
                 high-=1;
             }
             else{
                 low+=1;
             }
             int sumi=nums[i]+sumx;
         if(target>=sumi){
             diff=(target-(sumi));
         }
         else{
            diff=sumi-target;
         }
         
         
         if(diff<mini){
             mini=diff;
             out=sumi;
         }
             
         }
         

     }
     return out;

    }
}
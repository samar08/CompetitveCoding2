/*You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.
 
 */
import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
        int i,reachable=0,n=nums.length;
        for(i=0;i<n;i++){
            if(reachable<i){
                return false;
            }
            reachable=Math.max(reachable,i+nums[i]);
        }
        if(reachable>=n-1){
            return true;
        }
        return false;
    }
}
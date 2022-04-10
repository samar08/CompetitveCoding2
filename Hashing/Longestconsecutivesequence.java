import java.lang.*;
import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int i,j;
        if(n==0){
            return 0;
        }
        HashSet<Integer>set=new HashSet<Integer>();
        for(i=0;i<n;i++){
            set.add(nums[i]);
        }
        i=0;
        int maxcount=0;
        while(i<n){
            if(set.contains(nums[i]-1)==true){
                i+=1;
            }
            else{
                int count=1;
                j=nums[i]+1;
                while(set.contains(j)==true){
                    count+=1;
                    j+=1;
                }
                maxcount=Math.max(maxcount,count);
                i+=1;
            }
        }
        return maxcount;
        
    }
}

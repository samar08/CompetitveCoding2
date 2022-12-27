import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i,j,k,n=nums.length;
        List<List<Integer>> out=new ArrayList<List<Integer>>();
        HashSet<ArrayList<Integer>> outset=new HashSet<ArrayList<Integer>>();
        for(k=0;k<=n-3;k++){
            HashSet<Integer>set=new HashSet<Integer>();
            int sumi=-(nums[k]);
            for(i=k+1;i<n;i++){
                int diff=sumi-nums[i];
                if(set.contains(diff)){
                    ArrayList<Integer> temp=new ArrayList<Integer>();
                    temp.add(nums[k]);
                    temp.add(nums[i]);
                    temp.add(diff);
                    Collections.sort(temp);
                    outset.add(temp);
                }
                else{
                    set.add(nums[i]);
                }
            }

        }
        out.addAll(outset);
        return out;
        
    }
}
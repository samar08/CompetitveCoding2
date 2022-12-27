import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> out=new ArrayList<List<Integer>>();
        Set<List<Integer>> set=new HashSet<List<Integer>>();
        int i,j,l,r,s=0;
        int n=nums.length;
        for(i=0;i<n-2;i++){
            l=i+1;
            r=n-1;
            s=nums[i];
            while(l<r){
                if(nums[l]+nums[r]==-(s)){
                    List<Integer>temp=new ArrayList<Integer>();
                    temp.add(s);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    set.add(temp);
                    //break;
                    l++;
                    r--;
                }
                else if(nums[l]+nums[r]>-s){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        out.addAll(set);
        return out;   
    }
}
/*
 * Q. Given the list of adjacent values, find the possible array list.
 * 
 * Approach: Find the 0th index or last index value, by finding the element which has only one adjacent element. Then construct the whole array from there.
 * 
 */

import java.util.*;
class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        int i,n,m,j;
        m=adjacentPairs.length;
        n=m+1;
        int[] nums=new int[n];
        
        HashMap<Integer,ArrayList> map=new HashMap<>();
        for(i=0;i<m;i++){
            ArrayList<Integer> temp=map.getOrDefault(adjacentPairs[i][0],new ArrayList<Integer>());
            temp.add(adjacentPairs[i][1]);
            map.put(adjacentPairs[i][0],temp);
            ArrayList<Integer> temp2=map.getOrDefault(adjacentPairs[i][1],new ArrayList<Integer>());
            temp2.add(adjacentPairs[i][0]);
            map.put(adjacentPairs[i][1],temp2);
        }
        ArrayList<Integer> keys=new ArrayList<>(map.keySet());
        int kl=keys.size();
        for(i=0;i<kl;i++){
            System.out.println(map.get(keys.get(i)));
        }
        for(i=0;i<n;i++){
            if(map.get(keys.get(i)).size()==1){
                nums[0]=keys.get(i);
                nums[1]=(int)map.get(keys.get(i)).get(0);
                break;
            }
        }
        for(i=2;i<n;i++){
            ArrayList<Integer> list=map.get(nums[i-1]);
            int l=list.size();
            for(j=0;j<l;j++){
              if(list.get(j)!=nums[i-2]){
                  nums[i]=(int)list.get(j);
                  break;
              }
            }
            
        }
        return nums;
    }
}
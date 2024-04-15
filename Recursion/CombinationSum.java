import java.util.*;
class Solution {
    public void recursion(int[] candidates, int n,int index, int target,ArrayList<Integer>temp, List<List<Integer>> out){
     if(index>=n){
        return;
     }
    if(target==0){
        ArrayList<Integer>temp2=new ArrayList<>();
        int i,m=temp.size();
        for(i=0;i<m;i++){
            temp2.add(temp.get(i));
        }
        out.add(temp2);
        return ;
    }
     if(target>=candidates[index]){
        temp.add(candidates[index]);
       
         recursion(candidates, n, index, target-candidates[index],temp,out);
         temp.remove(temp.size()-1);
     }
    recursion(candidates,n,index+1,target,temp,out);
    
        
       

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> out=new ArrayList<List<Integer>>();
        ArrayList<Integer>temp=new ArrayList<>();
        int n=candidates.length;
        recursion(candidates, n,0, target, temp,out);
        return out;

    }
}
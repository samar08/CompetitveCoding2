public class Solution {
    public int solve(ArrayList<Integer> A) {
        int found=0;
        long prefix=0;
        int i,n=A.size();
        HashSet<Long>set=new HashSet<Long>();
        for(i=0;i<n;i++){
            prefix+=A.get(i);
            if(prefix==0){
                found=1;
                return 1;
            }
            else if(set.contains(prefix)){
                found=1;
                return 1;
            }
            else{
                set.add(prefix);
            }
        }
        return found;
    }
}

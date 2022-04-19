public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n=A.size();
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        int i,j;
        for(i=0;i<n;i++){
            if(i==0){
                prefix[i]=A.get(i);
            }
            else{
                prefix[i]=prefix[i-1]+A.get(i);
            }
        }
        for(i=n-1;i>=0;i--){
            if(i==n-1){
                suffix[i]=A.get(i);
            }
            else{
                suffix[i]=suffix[i+1]+A.get(i);
            }
        }
        for(i=0;i<n;i++){
            if(prefix[i]==suffix[i]){
                return i;
            }
        }
        return -1;
    }
}


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int i,n=A.size();
        int ans=0,b;
        for(b=0;b<32;b++){
            int cnt=0;
            for(i=0;i<n;i++){
                if((int)(A.get(i)&(1<<b))>0){
                    cnt+=1;
                }
            }
            if(cnt%3==1){
              ans=ans|(1<<b);    
            }
        }
        return ans;
    }
}

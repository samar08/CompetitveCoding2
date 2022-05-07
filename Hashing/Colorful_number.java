public class Solution {
    public int colorful(int A) {
        String a=Integer.toString(A);
        int i,j,n=a.length();
        if(n==1){
            return 1;
        }
        HashSet<Long>set=new HashSet<Long>();
        
        int k=1;
        long pro=1;
        for(k=1;k<=n;k++){
            for(i=0;i<=n-k;i++){
                pro=1;
                j=i+k-1;
                for(int t=i;t<=j;t++){
                    pro=pro*(a.charAt(t)-'0');
                }
                if(set.contains(pro)){
                    return 0;
                }
                else{
                    set.add(pro);
                   
                }
            
            }
        }
        return 1;
    }
}

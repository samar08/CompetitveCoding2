
class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int pre=-1;
        int i;
        int mini=Integer.MAX_VALUE;
        int xi=-1,yi=-1;
        for(i=0;i<n;i++){
            if(a[i]==x){
                if(pre==x){
                    xi=i;
                }
                else if(pre==y){
                    xi=i;
                    mini=Math.min(mini,i-yi);
                    pre=x;
                }
                else{
                  pre=x;
                  xi=i;
                }
                
            }
            else if(a[i]==y){
                if(pre==y){
                    yi=i;
                }
                else if(pre==x){
                    yi=i;
                    mini=Math.min(mini,i-xi);
                    pre=y;
                }
                else{
                  pre=y;
                  yi=i;
                }
            }
            
        }
        if(xi==-1 || yi==-1){
            return -1;
        }
        return mini;
    }
}

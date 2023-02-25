import java.lang.*;
class Solution {
    public int maxProfit(int[] prices) {
        int i,n=prices.length,maxi=0,mini=prices[0];
        if(n==1){
            return 0;
        }
        for(i=1;i<n;i++){
            if(prices[i]>mini){
                maxi=Math.max(maxi,prices[i]-mini);
            }
            else if(prices[i]<mini){
                mini=prices[i];
            }
        }
        return maxi;
        
    }
}
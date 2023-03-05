class Solution {
    public int maxProfit(int[] prices) {
        int i,n=prices.length,buy=0,profit=0;
        for(i=0;i<n;i++){
            if(i==0){
                buy=prices[i];
            }
            else{
                if(prices[i]>buy){
                    profit+=prices[i]-buy;
                    buy=prices[i];
                }
                else{
                    buy=prices[i];
                }
            }
        }
        return profit;
        
    }
}
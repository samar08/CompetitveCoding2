class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,i=n-1;
        int out=0;
        int currsell=0;
        for(i=n-1;i>=0;i--){
            if(i==n-1){
                currsell=prices[i];
            }
            else{
                if(prices[i]<currsell){
                    out+=currsell-prices[i];
                }
               
                    currsell=prices[i];
                
            }
        }
        return out;
    }
}
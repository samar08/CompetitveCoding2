class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i,n=tickets.length,time=0;
        while(tickets[k]>0){
            for(i=0;i<n;i++){
                if(tickets[k]>0 && tickets[i]>0){
                    tickets[i]-=1;
                    time+=1;
                }
            }
        }
        return time;
    }
}
/* O(n) solution */
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i,n=tickets.length,time=0;
        
        for(i=0;i<n;i++){
            if(i<=k){
            time+=Math.min(tickets[i],tickets[k]);
            }
            else{
                if(tickets[i]>=tickets[k]){
                    time+=tickets[k]-1;
                }
                else{
                    time+=tickets[i];
                }
            }
        }
        return time;
    }
}
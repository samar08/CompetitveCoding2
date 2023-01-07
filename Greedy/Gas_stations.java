class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length,i;
        int total_gas=0;
        int total_cost=0;
        if(n==1){
            if(gas[0]>=cost[0]){
                return 0;
            }
            return -1;
        }
        for(i=0;i<n;i++){
            total_gas+=gas[i];
            total_cost+=cost[i];
        }
        if(total_gas<total_cost){
            return -1;
        }
        int current_gas=0;
        int start=0;
        for(i=0;i<n;i++){
            current_gas=current_gas+(gas[i]-cost[i]);
            if(current_gas<0){
                current_gas=0;
                start=i+1;
            }
        }
        return start;

        
    }
}
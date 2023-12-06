class Solution {
    public int totalMoney(int n) {
        int prevMonday=0;
        int i=0,sum=0,days=0,daysInWeek=7;
        while(days<n){
            if(days%daysInWeek==0){
                  prevMonday+=1;
                  i=prevMonday;
                  
            }
            else{
              i+=1;
            }
            sum+=i;
            days++;
           
        }
        return sum;
    }
}
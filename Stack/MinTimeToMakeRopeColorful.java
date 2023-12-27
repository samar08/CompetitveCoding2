class Solution {
    public int minCost(String colors, int[] neededTime) {
     int i,n=neededTime.length,time=0;
     int[] removed=new int[n];
     Stack<Integer> stack=new Stack<>();
     stack.push(0);
     for(i=1;i<n;i++){
         int index=stack.peek();
         if(colors.charAt(i)==colors.charAt(index)){
             if(neededTime[index]>neededTime[i]){
                 
                 time+=neededTime[i];
             }
             else{
                 time+=neededTime[stack.pop()];
                 stack.push(i);
             }
         }
         else{
             stack.push(i);
         }
     } 
     return time; 
    }
}
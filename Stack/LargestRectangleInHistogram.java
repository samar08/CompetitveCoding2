import java.util.*;
class Solution {
    public int largestRectangleArea(int[] h) {
        
        Stack<Integer> stack=new Stack<>();
        int i,n=h.length;
        if(n==1){
            return h[0];
        }
        int maxi=0;
        int[] heights=new int[n+1];
        for(i=0;i<=n;i++){
            if(i==n){
                heights[i]=0;
            }
            else{
                heights[i]=h[i];
            }
        }
        for(i=0;i<=n;i++){
            if(stack.isEmpty()==true){
                stack.push(i);
            }
            else{
                while(stack.isEmpty()==false && heights[i]<=heights[(stack.peek())]){
                    int index=stack.pop();
                    int width=i;
                  
                    if(stack.isEmpty()==true){
                        width=i;
                    }
                    else{
                        width=i-stack.peek()-1;
                    }
                    maxi=Math.max(maxi,heights[index]*(width));

                }
                stack.push(i);
            }
        }
        return maxi;
    
    }
}
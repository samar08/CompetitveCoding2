import java.util.*;
import java.lang.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int i;
        int[]out=new int[n];
        Stack<Integer>st=new Stack<Integer>();
        for(i=n-1;i>=0;i--){
            st.push(nums[i]);
        }
        for(i=n-1;i>=0;i--){
            while(st.isEmpty()==false && nums[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()==false){
                out[i]=st.peek();
            }
            else{
                out[i]=-1;
            }
            st.push(nums[i]);
            
        }
        return out;
        
    }
}
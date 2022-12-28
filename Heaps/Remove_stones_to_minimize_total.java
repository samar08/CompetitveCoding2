import java.util.*;
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer>que=new PriorityQueue<Integer>(Collections.reverseOrder());
        int sumi=0,i,n=piles.length,half;
        for(i=0;i<n;i++){
            que.add(piles[i]);
            sumi+=piles[i];
        }
        while(k>0){
            int peek=que.poll();
            half=(int)(peek/2);
            sumi-=(half);
            que.add(peek-half);
            k-=1;
        }
        return sumi;


    }
}
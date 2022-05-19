public class Solution {
    public int solve(ListNode A) {
        ListNode h1=A;
        ListNode h2=A;
        int n=0;
        while(h1!=null){
            n+=1;
            h1=h1.next;
        }
        int ele=(int)(n/2)+1;
        int count=1;
        h1=A;
        while(count<ele){
            h1=h1.next;
            count+=1;
        }
        return h1.val;
        
    }
}
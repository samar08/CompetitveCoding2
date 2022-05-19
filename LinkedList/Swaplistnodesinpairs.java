public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode p=A,q,temp;
        if(p==null || p.next==null){
            return A;
        }
        ListNode head2=p.next;
        while(true){
            q=p.next;
            temp=q.next;
            q.next=p;
            if(temp==null || temp.next==null){
                p.next=temp;
                break;
            }
            p.next=temp.next;
            p=temp;

        }
        return head2;
        
    }
}
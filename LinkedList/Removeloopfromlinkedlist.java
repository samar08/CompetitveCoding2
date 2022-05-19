public class Solution {
    public ListNode solve(ListNode A) {
        ListNode fast=A;
        ListNode slow=A;
        if(slow.next==slow){
            slow.next=null;
            return slow;
        }
        slow=A.next;
        fast=A.next.next;
        while(fast!=slow){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=A;
        if(slow==fast){
            ListNode temp=A;
            while(temp.next!=A){
                temp=temp.next;
            }
            temp.next=null;
            return slow;
        }
        ListNode prev=fast;
        while(fast!=slow){
            prev=fast;
            fast=fast.next;
            slow=slow.next;

        }
        prev.next=null;
        return A;
    }
}
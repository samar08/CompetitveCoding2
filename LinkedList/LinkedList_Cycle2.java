/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast;
        if(slow==null){
            return null;
        }
        else{
            slow=head.next;
        }
        if(head.next!=null && head.next.next!=null){
            fast=head.next.next;
        }
        else{
            return null;
        }
        //slow=slow.next;
        //fast=head.next.next;
        while(fast!=slow){
            slow=slow.next;
            if(slow==null){
                return null;
            }
            if(fast.next!=null){
                 fast=fast.next.next;
            }
            else{
                return null;
            }
            
            if(fast==null){
                return null;
            }
            // System.out.println("fast: "+fast.val);
            // System.out.println("slow: "+slow.val);
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
        
    }
}
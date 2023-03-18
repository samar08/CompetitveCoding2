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
    public boolean hasCycle(ListNode head) {
     if(head==null || head.next==null){
         return false;
     }   
     ListNode slow=head.next;
     ListNode fast;
     if(head.next.next!=null){
         fast=head.next.next;
     }
     else{
         return false;
     }
     while(slow!=fast){
         if(slow.next!=null){
              slow=slow.next;
        }
        else{
            return false;
        }
         if(fast.next!=null && fast.next.next!=null){
             fast=fast.next.next;
         }
         else{
             return false;
         }
         
     }
     return true;
     
    }
}
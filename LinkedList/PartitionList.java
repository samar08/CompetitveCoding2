/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less=null;
        ListNode high=null;
        ListNode newhead1=null;
        ListNode newhead2=null;
        if(head==null){
            return head;
        }
        while(head!=null){
            if(head.val<x){
                if(less==null){
                    less=head;
                    newhead1=head;
                }
                else{
                    less.next=head;
                    less=less.next;
                }
            }
            else{
                if(high==null){
                    high=head;
                    newhead2=head;
                }
                else{
                    high.next=head;
                    high=high.next;
                }
            }
            head=head.next;
        }
        if(high!=null)
        high.next=null;
        if(less!=null){
             less.next=newhead2;
            return newhead1;
        }
        else{
            return newhead2;
        }
       
    }
}
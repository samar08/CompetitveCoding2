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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pre=head;
        ListNode post=head.next;
        while(post!=null){
            if(post.val==pre.val){
                while(post!=null && (post.val==pre.val)){
                    post=post.next;
                }
                pre.next=post;
            }
            pre=post;
            if(post!=null)
            post=post.next;
        }
        return head;
    }
}
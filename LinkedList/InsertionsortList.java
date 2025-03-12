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
    public ListNode insertionSortList(ListNode head) {
        ListNode node=head;
        if(node.next==null){
            return node;
        }
        if(node.next.next!=null){
            insertion(node.next);
        }
        if(node.val>node.next.val){
            while(node.next!=null && node.val>node.next.val){
            int temp=node.val;
            node.val=node.next.val;
            node.next.val=temp;
            node=node.next;
          }  
        }
        return head;
    }
    public void insertion(ListNode node){
        if(node.next.next!=null){
            insertion(node.next);
        }
        if(node.val>node.next.val){
          
          while(node.next!=null && node.val>node.next.val){
            int temp=node.val;
            node.val=node.next.val;
            node.next.val=temp;
            node=node.next;
          }  
        }
        //return node;
    }
}
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
    boolean reachedend=false;
    int c=0;
    public ListNode recurse(ListNode head,int n){
        
       
        if(head.next==null){
            reachedend=true;
            c+=1;
            if(c==n){
                return head.next;
            }
            return head;
        }
         head.next=recurse(head.next,n);
       if(reachedend==true){
            c+=1;
            if(c==n){
                return head.next;
            }
            return head;
        }
        return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return recurse(head,n);
    }
}
/*
 * another solution
 * class Solution {
    public int remove(ListNode node,int n){
        if(node.next!=null){
            int temp=remove(node.next,n);
            if(temp==n){
                node.next=node.next.next;  
            }
             return temp+1; 
        }
        else{
            return 1;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        int i= remove(head,n);
        if(i==n){
            head=head.next;
        }
        return head;
        
    }
}
 * 
 */
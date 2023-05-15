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
    public ListNode find(ListNode head, int k,int i,int[] j,ListNode[] c1,ListNode c2){
        if(head!=null){
            if(i==k){
            c1[0]=head;
            //System.out.println("c1: "+c1[0].val);
        }
        ListNode temp3=find(head.next,k,i+1,j,c1,c2);
        }
        if(j[0]==k){
            int temp=head.val;
            int temp2=c1[0].val;
            c2=head;
            c2.val=temp2;
            c1[0].val=temp;

        }
        j[0]+=1;
        return head;
        
    }
    public ListNode swapNodes(ListNode head, int k) {
        int i=1;
        ListNode[] c1=new ListNode[]{head};
        ListNode c2=head;
        int[] j=new int[]{0};
        head=find(head,k,i,j,c1,c2);
        return head;
        
    }
}
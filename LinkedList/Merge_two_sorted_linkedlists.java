public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
    ListNode temp1=A;
    ListNode temp2=B;
    ListNode head=null;
    if(temp1.val<temp2.val){
        head=temp1;
        temp1=temp1.next;
    }
    else{
        head=temp2;
        temp2=temp2.next;
    }
    ListNode temp=head;
    while(temp1!=null && temp2!=null){
        if(temp1.val<temp2.val){
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;
        }
        else{
            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
        }
    }
    while(temp1!=null){
        temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;
    }
    while(temp2!=null){
        temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
    }
return head;
    }
}
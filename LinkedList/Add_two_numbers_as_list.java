public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode p=A;
        ListNode q=B;
        ListNode head=null;
        ListNode temp=null;
        int carry=0;
        while(p!=null && q!=null){
            int sum=p.val+q.val+carry;
            int c=(int)(sum/10);
            int rem=sum%10;
            carry=c;
            if(head==null){
                head=new ListNode(rem);
                temp=head;
            }
            else{
            ListNode dig=new ListNode(rem);
            temp.next=dig;
            temp=temp.next;
            }
            p=p.next;
            q=q.next;
        }
        while(p!=null){
            int sum=p.val+carry;
            int c=(int)(sum/10);
            int rem=sum%10;
            carry=c;
            ListNode dig=new ListNode(rem);
            temp.next=dig;
            temp=temp.next;
            p=p.next;
        }
        while(q!=null){
            int sum=q.val+carry;
            int c=(int)(sum/10);
            int rem=sum%10;
            carry=c;
            ListNode dig=new ListNode(rem);
            temp.next=dig;
            temp=temp.next;
            q=q.next;
        }
        if(carry>0){
            ListNode dig=new ListNode(carry);
            temp.next=dig;
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}
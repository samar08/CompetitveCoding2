public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode p=A,q,temp;
        if(p==null || p.next==null){
            return A;
        }
        ListNode head2=p.next;
        while(true){
            q=p.next;
            temp=q.next;
            q.next=p;
            if(temp==null || temp.next==null){
                p.next=temp;
                break;
            }
            p.next=temp.next;
            p=temp;

        }
        return head2;
        
    }
}
// Another similar approach
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode head2=null,s=head,f=s.next,t=f.next;
       
        while(f!=null || t!=null){
            if(t!=null && t.next!=null){
                 s.next=t.next;
            }
            else{
                s.next=t;
            }
           
            f.next=s;
            if(head2==null){
                head2=f;
            }
            if(t==null || t.next==null){
                break;
            }
            else{
                s=t;
                f=t.next;
              
                t=f.next;
            }
        }
        return head2;
        
    }
}
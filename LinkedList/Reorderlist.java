public class Solution {
    public ListNode reverse(ListNode A){
        ListNode curr=A;
	        ListNode prev=null;
	        ListNode next=null;
	        while(curr!=null){
	            next=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=next;
	        }
        return prev;
    }
    public ListNode reorderList(ListNode A) {
        ListNode t=A;
        int n=0;
        while(t!=null){
            n+=1;
            t=t.next;
        }
        if(n<=2){
            return A;
        }
        int point=(int)(n/2);
        if(n%2==0){
            point--;
        }
        ListNode h1=A;
        t=h1;
        int count=0;
        while(count<point){
            t=t.next;
            count+=1;
        }
        ListNode h2=t.next;
        t.next=null;
        h2=reverse(h2);

        ListNode c1=A,c2=h2;
        ListNode n1=c1.next,n2=c2.next;
        while(c1!=null && c2!=null){
            c1.next=c2;
            c2.next=n1;
            c1=n1;
            c2=n2;
            if(c1!=null)
            n1=c1.next;
            if(c2!=null){
                n2=c2.next;
            }
        }
        if(c1!=null){
            c1.next=c2;
        }
        return A;

    }
}

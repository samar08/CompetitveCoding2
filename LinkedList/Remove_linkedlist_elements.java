class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode pointer1=head;
        ListNode pointer2=head.next;
        if(pointer2==null){
            if(pointer1.val==val){
                pointer1=null;
                return null;
            }
        }
        while(pointer1!=null && pointer1.val==val){
            head=pointer2;
            pointer1=head;
            if(head!=null)
            pointer2=head.next;
        }
        while(pointer2!=null){
            while(pointer2!=null && pointer2.val==val){
                pointer2=pointer2.next;
            }
            pointer1.next=pointer2;
            pointer1=pointer2;
            if(pointer2!=null)
            pointer2=pointer2.next;
            

        }
        return head;

    }
}
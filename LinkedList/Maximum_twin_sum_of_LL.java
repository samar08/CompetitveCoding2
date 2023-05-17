// O(n) time and O(n) space
class Solution {
    public void traverse(ListNode head,ArrayList<Integer> list,int count,int[] total,int[] maxi){
        if(head.next!=null){
            list.add(head.val);
            count+=1;
            traverse(head.next,list,count,total,maxi);
        }
        else if(head.next==null){
            count+=1;
            total[0]=count;
        }
        if(count>(int)(total[0]/2)){
            int sum=head.val+list.get(0);
            maxi[0]=Math.max(maxi[0],sum);
            list.remove(0);
        }

    }
    public int pairSum(ListNode head) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        int[] maxi=new int[]{-1};
        traverse(head,list,0,new int[]{0},maxi);
        return maxi[0];
    }
}

//O(n) time and O(1) space
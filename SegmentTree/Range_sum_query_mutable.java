class TreeNode{
    int sum=0,low=0,high=0;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode(int sum,int low,int high){
        this.sum=sum;
        this.low=low;
        this.high=high;
    }
}
class SegmentTree{
    public TreeNode buildtree(int[] nums,int low,int high,TreeNode head){
        if(low==high){
            return new TreeNode(nums[low],low,high);
        }
        if(head==null){
            head=new TreeNode(0,low,high);
        }
        int mid=(int)((low+high)/2);
        head.left=buildtree(nums,low,mid,head.left);
        head.right=buildtree(nums,mid+1,high,head.right);
        head.sum=head.left.sum+head.right.sum;
        return head;
    }
    public TreeNode update(int index,int val,TreeNode head){
        if(head==null){
            return head;
        }
        if((head.low==head.high) && (head.low==index)){
            head.sum=val;
            return head;
        }
        if(index<=head.high && index>=head.low){
            if(head.left!=null){
                head.left=update(index,val,head.left); 
            }
           if(head.right!=null){
                 head.right=update(index,val,head.right);
           }
          int leftsum=0;
          int rightsum=0;
          if(head.left!=null){
              leftsum=head.left.sum;
          }  
          if(head.right!=null){
              rightsum=head.right.sum;
          }
            head.sum=leftsum+rightsum;
            return head;
        }
        
        return head;
    }
    public int sum(int left,int right,TreeNode head){
        if(head==null){
            return 0;
        }
        if(((head.low==head.high) && (head.low>=left && head.low<=right))){
            return head.sum;
        }
        if(right<head.low){
            return 0;
        }
        else if(left>head.high){
            return 0;
        }
        else{
            if(head.low>=left && head.high<=right)
            {
                return head.sum;
            }
            else{
                int leftsum=sum(left,right,head.left);
            int rightsum=sum(left,right,head.right);
            return leftsum+rightsum;
            }
            
        }
        
    }
    public void traverse(TreeNode head){
        if(head!=null){
            traverse(head.left);
            System.out.println(head.low+" "+head.high+" "+head.sum);
            traverse(head.right);
        }
    }
}
class NumArray {
    TreeNode head=null;
    SegmentTree tree;
    public NumArray(int[] nums) {
        int low=0,high=nums.length-1;
        this.tree=new SegmentTree();
       this.head=this.tree.buildtree(nums,low,high,this.head);
       // tree.traverse(head);
    }
    
    public void update(int index, int val) {
        this.head=this.tree.update(index,val,this.head);
        // tree.traverse(head);
    }
    
    public int sumRange(int left, int right) {
        return this.tree.sum(left,right,this.head);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
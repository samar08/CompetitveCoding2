class Solution {
    int sum=0;
    public TreeNode Gst(TreeNode root){
        if(root!=null){
            root.right=Gst(root.right);
            sum+=root.val;
            root.val=sum;
           root.left=Gst(root.left);
          
        }
            return root;
    }
    public TreeNode bstToGst(TreeNode root) {

            return Gst(root);      
        
    }
}
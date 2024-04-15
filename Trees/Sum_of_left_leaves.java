class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
      
        if(root==null){
            return 0;
        }
        int sum=0,i;
        if(root.left!=null){
            if(root.left.right==null && root.left.left==null){
                sum+=root.left.val;
            }
            
        }
        if(root.left!=null){
            sum+=sumOfLeftLeaves(root.left);
        }
        if(root.right!=null){
            sum+=sumOfLeftLeaves(root.right);
        }
        return sum;
        
    }
}
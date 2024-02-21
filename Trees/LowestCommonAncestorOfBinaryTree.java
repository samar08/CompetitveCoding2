
class Solution {
    public TreeNode lca(TreeNode root, TreeNode p , TreeNode q){
        if(root==null){
            return null;
        }
        if(root.val==p.val || root.val==q.val){
            return root;
        }
        TreeNode leftnode=lca(root.left,p,q);
        TreeNode rightnode=lca(root.right,p,q);
        if(leftnode!=null && rightnode!=null){
            return root;
        }
        else if(leftnode!=null && rightnode==null){
            return leftnode;
        }
        else if(leftnode==null && rightnode!=null){
            return rightnode;
        }
       return null;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root.val==p.val || root.val==q.val){
            return root;
        }
        TreeNode leftfound=lca(root.left,p,q);
        TreeNode rightfound=lca(root.right,p,q);
        if(leftfound!=null && rightfound!=null){
            return root;
        }
        else if(leftfound!=null && rightfound==null){
            return leftfound;
        }
         else if(leftfound==null && rightfound!=null){
            return rightfound;
        }
       return null;
    }
}
class Solution {
    public boolean checkleafequalstarget(TreeNode root, int target){
        if(root.left==null && (root.right==null && root.val==target)){
            return true;
        }
        boolean left=false,right=false;
        if(root.left!=null){
            left=checkleafequalstarget(root.left,target);
        }
        if(root.right!=null){
          right=checkleafequalstarget(root.right,target);
        }
        if(left==true){
            root.left=null;
        }
        if(right==true){
            root.right=null;
        }
        if(root.left==null && (root.right==null && root.val==target)){
                return true;
            }
            return false;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        boolean left=false,right=false;
        if(root.left!=null){
            left=checkleafequalstarget(root.left,target);
        }
        if(root.right!=null){
            right=checkleafequalstarget(root.right,target);
        }
        if(left==true){
            root.left=null;
        }
        if(right==true){
            root.right=null;
        }
       
            if(root.left==null && (root.right==null && root.val==target)){
                return null;
            }
        
        return root;
    }
}
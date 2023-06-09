/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumofleftleaves(TreeNode node){
        if(node!=null){
            int count=0;
            if(node.left!=null){
                TreeNode left=node.left;
                if(left.left==null && left.right==null){
                    count+=left.val;
                }
                else{
                    count+=sumofleftleaves(node.left);
                }
            }
            if(node.right!=null){
                 count+=sumofleftleaves(node.right);
            }
            return count;
        }
        else{
            return 0;
        }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int count=0;
        if(root.left!=null){
            TreeNode left=root.left;
            if(left.left==null && left.right==null){
                count+=left.val;
            }
            else{
                 count+=sumofleftleaves(left);
            }
        }
        if(root.right!=null){
            count+=sumofleftleaves(root.right);
        }
        return count;
    }
}
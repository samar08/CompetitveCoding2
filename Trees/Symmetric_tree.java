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
    public boolean isMirror(TreeNode a,TreeNode b){
        if(a==null && b==null){
            return true;
        }
        else if(a==null || b==null){
            return false;
        }
        if(a.val==b.val){
            return (isMirror(a.left,b.right) & isMirror(a.right,b.left));
        }
        else{
            return false;
        }
    }
    
    public boolean isSymmetric(TreeNode root) {
        if(root!=null){
            
            return isMirror(root.left,root.right);
        }
        else{
            return true;
        }
        
    }
}
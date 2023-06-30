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
    public boolean inorder(TreeNode root,Stack<Integer> st){
        if(root==null){
            return true;
        }
        else{
           boolean res1=inorder(root.left,st);
           if(st.size()>0 && st.peek()>=root.val){
               return false;
           }
           else{
               st.push(root.val);
           }
       
           boolean res2=inorder(root.right,st);
           return res1&res2;
        }
    }
    public boolean isValidBST(TreeNode root) {
        Stack<Integer> st=new Stack<Integer>();
        boolean res=inorder(root,st);
        return res;
        
    }
}
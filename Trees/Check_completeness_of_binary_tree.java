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
import java.util.*;
class Solution {
    public boolean bfs(TreeNode root,ArrayList<Integer> arr){
        Queue<TreeNode>q= new LinkedList<TreeNode>();
        q.add(root);
        boolean first_traversed=false;
        boolean reached_end=false;
        while(q.isEmpty()!=true){
            TreeNode node=q.poll();
            if(first_traversed==false){
                first_traversed=true;
            }
            if(reached_end==false){
                 if(node.left==null){
                reached_end=true;
                }
                else{
                    q.add(node.left);
                }
                if(node.right==null){
                    reached_end=true;
                }
                else{
                    q.add(node.right);
                }
                if(reached_end==true){
                    if(node.right!=null){
                        return false;
                    }
                
                }
            }
            else if(reached_end==true){
                if(node.left!=null || node.right!=null){
                    return false;
                }
            }
            
        }
        return true;
    }
    public boolean isCompleteTree(TreeNode root) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        return bfs(root,arr);
    }
}
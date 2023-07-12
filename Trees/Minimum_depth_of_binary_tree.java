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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        que.add(root);
        int out=0,i=0,n;
        while(true){
            n=que.size();
            
            if(n>0){
                out+=1;
            
            for(i=0;i<n;i++){
                TreeNode child=que.poll();
               
                if(child.left==null && child.right==null){
                    return out;
                }
                else{
                    if(child.left!=null){
                        que.add(child.left);
                    }
                    if(child.right!=null){
                        que.add(child.right);
                    }
                }
            }
            }
            else{
                break;
            }
        }
        return out;
        
    }
}
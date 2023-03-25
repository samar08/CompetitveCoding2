/*
 * Convert sorted array to height balanced BST
 */
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
    public TreeNode constructbst(TreeNode root,int[] nums,int st,int end){
        if(st<=end){
          
                int mid=st+(int)((end-st)/2);
                root=new TreeNode(nums[mid]);
                root.left=constructbst(root.left,nums,st,mid-1);
                root.right=constructbst(root.right,nums,mid+1,end);
            
        }
        return root;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=null;
        int i,n=nums.length;
        int mid=(int)(n/2);
        root=constructbst(root,nums,0,n-1);
        
        return root;
    }
}
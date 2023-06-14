import java.util.*;
import java.lang.*;
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
    
    public void preorder(TreeNode root,ArrayList<Integer>arr){
        if(root!=null){
            preorder(root.left,arr);
            arr.add(root.val);
            preorder(root.right,arr);
        }
    }
    public int getMinimumDifference(TreeNode root) {
        int diff=Integer.MAX_VALUE;
        ArrayList<Integer>arr=new ArrayList<Integer>();
        preorder(root,arr);
        int i=0,n=arr.size();
        for(i=1;i<n;i++){
            diff=Math.min(diff,arr.get(i)-arr.get(i-1));
        }
        return diff;
    }
}
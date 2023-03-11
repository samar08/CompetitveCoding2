/*
 * A height balanced binary search tree is a tree which follows properties of BST and also the difference between height of left subtree and right subtree for any node is not greater than 1.
 * examples of height balanced BST are AVL tree and red-black tree.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
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
    public int find_height_diff(TreeNode treehead,HashMap<TreeNode,Integer>map){
        int leftheight=map.getOrDefault(treehead.left,0);
        int rightheight=map.getOrDefault(treehead.right,0);
        return (leftheight-rightheight);
    }
     public TreeNode rotateright(TreeNode treehead,HashMap<TreeNode,Integer>map){
         TreeNode x=treehead.left;
        TreeNode T=x.right;
        x.right=treehead;
        treehead.left=T;
        map.put(treehead,1+Math.max(map.getOrDefault(treehead.left,0),map.getOrDefault(treehead.right,0)));
        map.put(x,1+Math.max(map.getOrDefault(x.left,0),map.getOrDefault(x.right,0)));
        return x;
    }
    public TreeNode rotateleft(TreeNode treehead,HashMap<TreeNode,Integer>map){
        TreeNode x=treehead.right;
        TreeNode T=x.left;
        x.left=treehead;
        treehead.right=T;
        map.put(treehead,1+Math.max(map.getOrDefault(treehead.left,0),map.getOrDefault(treehead.right,0)));
        map.put(x,1+Math.max(map.getOrDefault(x.left,0),map.getOrDefault(x.right,0)));
        return x;
    }
    public TreeNode insert(TreeNode treehead,ListNode head,HashMap<TreeNode,Integer>map){
        if(treehead==null){
            treehead=new TreeNode(head.val);
            map.put(treehead,1);
            return treehead;
        }
        if(head.val>=treehead.val){
            treehead.right=insert(treehead.right,head,map);
        }
        else{
            treehead.left=insert(treehead.left,head,map);
        }
    map.put(treehead,1+Math.max(map.getOrDefault(treehead.left,0),map.getOrDefault(treehead.right,0)));
        int diff=find_height_diff(treehead,map);
        // left left
        if(diff>1 && treehead.left.val>head.val){
            return rotateright(treehead,map);
        }
        //left right
        else if(diff>1 && treehead.left.val<=head.val){
            TreeNode temp=rotateleft(treehead,map);
            return rotateright(temp,map);
        }
        //right right
        else if(diff<-1 && treehead.right.val<=head.val){
            return rotateleft(treehead,map);
        }
        //right left
        else if(diff<-1 && treehead.right.val>head.val){
            TreeNode temp=rotateright(treehead,map);
            return rotateleft(temp,map);
        }
       return treehead;

    }

    public TreeNode sortedListToBST(ListNode head) {
        TreeNode treehead=null;
        HashMap<TreeNode,Integer>map=new HashMap<TreeNode,Integer>();
        int i,j;
        while(head!=null){
            treehead=insert(treehead,head,map);
            head=head.next;
        }
        return treehead;


    }
}
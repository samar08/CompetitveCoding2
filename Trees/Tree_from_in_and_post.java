
 import java.util.*;
 import java.lang.*;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class Tree_from_in_and_post {
    public static TreeNode constructTree(int[] inorder,int[] postorder,int is,int ie,int ps,int pe,HashMap<Integer,Integer> map){
        if(ie-is+1==1){
            return new TreeNode(inorder[is]);
        }
        else if(ie-is+1<=0){
            return null;
        }
        else{
            TreeNode root=new TreeNode(postorder[pe]);
            int i=map.get(postorder[pe]);
            root.left=constructTree(inorder,postorder,is,i-1,ps,ps+(i-is-1),map);
            root.right=constructTree(inorder,postorder,i+1,ie,ps+(i-is),pe-1,map);
            return root;
        }

    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=constructTree(inorder,postorder,0,n-1,0,n-1,map);
        return root;
    }
    public static void bfs(TreeNode root){
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(q.isEmpty()!=true){
            TreeNode node=q.poll();
            System.out.print(node.val+",");
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
        }
    }
    public static void main(String[] args){
        int[] inorder=new int[]{9,3,15,20,7};
        int[] postorder= new int[]{9,15,7,20,3};
        TreeNode root=buildTree(inorder,postorder);
        bfs(root);
    }
}
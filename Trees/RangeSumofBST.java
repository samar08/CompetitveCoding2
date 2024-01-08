class Solution {
    public int traverse(TreeNode root, int low ,int high){
        int sum=0;
        if(root==null){
            return sum;
        }
        if(root.val<=high && root.val>=low){
            sum+=root.val;
             sum+=traverse(root.left,low,high);
             sum+=traverse(root.right,low,high);
        }
        else if(root.val>high){
            sum+=traverse(root.left,low,high);
        }
        else if(root.val<low){
            sum+=traverse(root.right,low,high);
        }
        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        sum=traverse(root,low,high);
        return sum;
    }
}
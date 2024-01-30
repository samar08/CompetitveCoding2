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
    public void traverse(TreeNode root, TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>>map,int index, int height){
        TreeMap<Integer,ArrayList<Integer>> tmap=map.getOrDefault(index,new TreeMap<>());
        ArrayList<Integer> list=tmap.getOrDefault(height,new ArrayList<>());
        list.add(root.val);
        tmap.put(height,list);
        map.put(index,tmap);
        if(root.left!=null){
            traverse(root.left,map,index-1,height+1);
        }
        if(root.right!=null){
            traverse(root.right,map,index+1,height+1);
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map=new TreeMap<>();
        int index=0,i=0,height=0;
        TreeMap<Integer,ArrayList<Integer>> tmap=map.getOrDefault(index,new TreeMap<>());
        ArrayList<Integer> list=tmap.getOrDefault(height,new ArrayList<>());
        list.add(root.val);
        tmap.put(height,list);
        map.put(index,tmap);
        if(root.left!=null){
            traverse(root.left,map,index-1,height+1);
        }
        if(root.right!=null){
            traverse(root.right,map,index+1,height+1);
        }
        List<List<Integer>> out=new ArrayList<>();
        Iterator keys=map.keySet().iterator();
        while(keys.hasNext()){
            
           ArrayList<Integer> ans=new ArrayList<Integer>();
           int key=(int)keys.next();
           Iterator it=map.get(key).keySet().iterator();
           while(it.hasNext()){
               ArrayList<Integer> temp=map.get(key).get(it.next());
               Collections.sort(temp);
               for(Integer l: temp){
                   ans.add(l);
               }
               
           }
           

            out.add(ans);
        }
        return out;
        
        
    }
}
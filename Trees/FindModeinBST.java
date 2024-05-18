class Solution {
    public void fillmap(TreeNode root, HashMap<Integer,Integer>map){
        if(root!=null){

        
        fillmap(root.left,map);
        map.put(root.val, map.getOrDefault(root.val,0)+1);
        fillmap(root.right,map);
    }
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer>map=new HashMap<>();
        fillmap(root,map);
        ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b ){
                if(a.getValue()>b.getValue()){
                    return -1;
                }
                else if(a.getValue()==b.getValue()){
                    return 0;
                }
                else{
                    return 1;
                }
            }
        });
        int maxi=list.get(0).getValue();
        int maxkey=list.get(0).getKey();
        ArrayList<Integer>out=new ArrayList<>();
        out.add(maxkey);
        int size=list.size();
        int i;
        for(i=1;i<size;i++){
            if(list.get(i).getValue()==maxi){
                out.add(list.get(i).getKey());
            }
            else{
                break;
            }
        }
        int outsize=out.size();
        int[] outarr=new int[outsize];
        for(i=0;i<outsize;i++){
            outarr[i]=out.get(i);
        }
        return outarr;
    }
}
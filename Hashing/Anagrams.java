public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        HashMap<HashMap<Character,Integer>,ArrayList<Integer>>map=new HashMap<HashMap<Character,Integer>,ArrayList<Integer>>();
        int i,j;
        int n=A.size();
        for(i=0;i<n;i++){
            HashMap<Character,Integer>mc=new HashMap<Character,Integer>();
            for(char c:A.get(i).toCharArray()){
                mc.put(c,mc.getOrDefault(c,0)+1);
            }
            //System.out.println(mc);
            if(map.containsKey(mc)==true){
                 ArrayList<Integer>arr=map.get(mc);
                 arr.add(i+1);
                map.put(mc,arr);
            }
            else{
                ArrayList<Integer>arr=new ArrayList<Integer>();
                arr.add(i+1);
                map.put(mc,arr);
            }
        }
        ArrayList<ArrayList<Integer>>out=new ArrayList<ArrayList<Integer>>();
        for(HashMap<Character,Integer> key: map.keySet()){
            out.add(map.get(key));
        }
        return out;

    }
}

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        String[] strb=new String[n];
        List<List<String>> out=new ArrayList<List<String>>();
        int i;

        for(i=0;i<n;i++){
            String st=strs[i];
            char[] temp=st.toCharArray();
            Arrays.sort(temp);
            strb[i]=new String(temp);
        }
        // for(i=0;i<n;i++){
        //     System.out.println(strs[i]);
        // }
        
        HashMap<String,ArrayList<String>>map=new HashMap<String,ArrayList<String>>();
        for(i=0;i<n;i++){
            ArrayList<String> arr=map.getOrDefault(strb[i],new ArrayList<String>());
            arr.add(strs[i]);
            map.put(strb[i],arr);
        }
        for(String key: map.keySet()){
           out.add(map.get(key));
        }
        return out;

    }
}
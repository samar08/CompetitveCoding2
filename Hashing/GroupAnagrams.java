class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        int i,j;
        List<List<String>> out=new ArrayList<List<String>>();
	 HashMap<HashMap<Character,Integer>,ArrayList<String>> map=new HashMap<>();
	 int n=arr.length;
	 for(i=0;i<n;i++){
	     HashMap<Character,Integer> smap=new HashMap<>();
	     for(j=0;j<arr[i].length();j++){
	         smap.put(arr[i].charAt(j),smap.getOrDefault(arr[i].charAt(j),0)+1);
	     }
	     ArrayList<String> list=map.getOrDefault(smap,new ArrayList<String>());
	     list.add(arr[i]);
	     map.put(smap,list);
	 }
	 for(HashMap<Character,Integer> key: map.keySet()){
	     out.add(map.get(key));
	 }
     return out;
    }
}
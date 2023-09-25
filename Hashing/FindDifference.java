class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        int i=0,n=s.length(),m=t.length();
        for(i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(i=0;i<m;i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        for(i=0;i<m;i++){
            if(map.containsKey(t.charAt(i))==false){
                return t.charAt(i);
            }
            if(map2.get(t.charAt(i))-map.get(t.charAt(i))==1){
                return t.charAt(i);
            }
        }
        return 'a';
    }
}
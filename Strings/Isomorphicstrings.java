class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map= new HashMap<>();
        int i,n=s.length(),m=t.length();
        HashSet<Character> set=new HashSet<>();
        if(n!=m){
            return false;
        }
        if(n==m && (n==1)){
            return true;
        }
        for(i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))==true){
                if(t.charAt(i)!=map.get(s.charAt(i))){
                    return false;
                }
            }
            else{
                if(set.contains(t.charAt(i))==true){
                    return false;
                }
                else{
                    map.put(s.charAt(i),t.charAt(i));
                    set.add(t.charAt(i));
                }
                
            }
        }
        return true;
    }
}
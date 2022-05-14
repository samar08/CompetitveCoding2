public class Solution {
    public int solve(int A, String B) {
        int n=B.length();
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        for(int i=0;i<n;i++){
            map.put(B.charAt(i),map.getOrDefault(B.charAt(i),0)+1);
        }
        for(Character key:map.keySet()){
            if(map.get(key)%A!=0){
                return -1;
            }
        }
        return 1;


    }
}

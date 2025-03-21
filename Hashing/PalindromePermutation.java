class Solution {
    public boolean canPermutePalindrome(String s) {
        int i,n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        // for(i=0;i<n;i++){

        // }
        for(Character c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int odd=0;
        int even=0;
        Set<Character> keys=map.keySet();
        Iterator it=keys.iterator();
        while(it.hasNext()){
            if(map.get(it.next())%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        if(odd==0 || odd==1){
            return true;
        }
        
        return false;
    }
}
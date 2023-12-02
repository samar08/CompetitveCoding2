class Solution {
    public int countCharacters(String[] words, String chars) {
        int n=words.length,i,m=chars.length(),j;
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        for(i=0;i<m;i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        int sum=0;
        for(i=0;i<n;i++){
            String word=words[i];
            int n1=word.length();
            boolean flag=true;
            HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
            for(j=0;j<n1;j++){
                map2.put(word.charAt(j),map2.getOrDefault(word.charAt(j),0)+1);
            }
            for(Character key: map2.keySet()){
                if(map.containsKey(key)==false || map.get(key)<map2.get(key)){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                sum+=n1;
            }
        }
        return sum;
    }
}
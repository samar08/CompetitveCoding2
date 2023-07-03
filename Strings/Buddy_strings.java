class Solution {
    public boolean buddyStrings(String s, String goal) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        HashMap<Character,Integer>map2=new HashMap<Character,Integer>();
        int i,n=s.length(),m=goal.length();
        if(n!=m){
            return false;
        }
        int count=0;
        char c;
        boolean morefound=false;
        for(i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map2.put(goal.charAt(i),map2.getOrDefault(goal.charAt(i),0)+1);
            if(map.get(s.charAt(i))>=2){
                morefound=true;
            }
            if(s.charAt(i)!=goal.charAt(i)){
                count+=1;
            }
        }
        if(count==2){
            if(map.equals(map2)==true){
                return true;
            }
            else{
                return false;
            }
            
        }
        else if(count==0){
            if(map.get(s.charAt(0))==n && n>=2){
                return true;
            }
            else if(morefound==true){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
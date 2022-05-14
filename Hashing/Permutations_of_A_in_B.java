public class Solution {
    public int solve(String A, String B) {
    int n=A.length();
    int m=B.length();
    int i,j,count=0;
    HashMap<Character,Integer>map=new HashMap<Character,Integer>();
    for(i=0;i<n;i++){
        map.put(A.charAt(i),map.getOrDefault(A.charAt(i),0)+1);
    }
     HashMap<Character,Integer>map2=new HashMap<Character,Integer>();
    for(i=0;i<n;i++){
        map2.put(B.charAt(i),map2.getOrDefault(B.charAt(i),0)+1);
    }
    if(map2.equals(map)){
        count++;
    }
    i=n;
    while(i<m){
        if(map2.get(B.charAt(i-n))==1){
            map2.remove(B.charAt(i-n));
        }
        else{
            map2.put(B.charAt(i-n),map2.get(B.charAt(i-n))-1);
        }
        
        map2.put(B.charAt(i),map2.getOrDefault(B.charAt(i),0)+1);
        if(map2.equals(map)){
            count++;
        }
        i+=1;
        
    }
    return count;

    }
}

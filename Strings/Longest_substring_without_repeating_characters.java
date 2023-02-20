import java.util.*;
//import java.lang.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n=s.length(),maxi=Integer.MIN_VALUE,start=0,end=0;
       HashSet<Character>set=new HashSet<Character>();
       while(end<n){
        if(set.contains(s.charAt(end))){
            maxi=Math.max(maxi, end-start);
            while((start<end) && (s.charAt(start)!=s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.remove(s.charAt(start));
            start++;
            set.add(s.charAt(end));
            end++;
        }
        else{
            if(end!=n-1){
                set.add(s.charAt(end));
              
            }
            else{
                set.add(s.charAt(end));
                return Math.max(maxi,end-start+1);
            }
            end++;
        }
        
       } 
       if(end-start==n)
       return n;

       return maxi;
    }
}

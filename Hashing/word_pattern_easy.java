/*Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false

 */
import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        int n=pattern.length(),m=arr.length,i;
        HashMap<Character,String>map=new HashMap<Character,String>();
        HashSet<String>set=new HashSet<String>();
        int k=0;
        if(m!=n){
            return false;
        }
        for(i=0;i<n;i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(set.contains(arr[k])){
                    return false;
                }
                else{
                    set.add(arr[k]);
                }
                map.put(pattern.charAt(i),arr[k]);
            }
            k++;
        }
        k=0;
        boolean res=true;
        for(i=0;i<n;i++){
            if(!map.get(pattern.charAt(i)).equals(arr[k])){
                res=false;
                break;
            }
            k++;
        }
        return res;

    }
}
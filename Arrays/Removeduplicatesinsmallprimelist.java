import java.util.*;
class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        int i;
        ArrayList<Integer>out;
        for(i=0;i<n;i++){
            if(!set.contains(arr[i])){
              
                set.add(arr[i]);
            }
            
        }
        out=new ArrayList<>(set);
        return out;
    }
}
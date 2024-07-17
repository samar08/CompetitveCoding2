import java.util.*;
class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer>setA=new HashSet<>();
        
        int i,j,count=0;
        for(i=0;i<n;i++){
            setA.add(a[i]);
        }
        for(j=0;j<m;j++){
            if(setA.contains(b[j])){
                count++;
                setA.remove(b[j]);
            }
        }
        return count;
        
        
    }
};
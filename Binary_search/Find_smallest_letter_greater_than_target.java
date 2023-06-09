class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      int n=letters.length,low=0,high=n-1,mid=0;
      while(low<=high){
          mid=low+(int)((high-low)/2);
          if(letters[mid]<=target){
              low=mid+1;
          }
          else if(letters[mid]>target){
              high=mid-1;
          }
      }
      if(high<0){
          high=0;
          return letters[high]; 
      }
      if(low==n){
          return letters[0];
      }
      else if(letters[high]<=target){
          return letters[low];
      }

      return letters[high];  
    
    }
}
class Solution {
    public boolean valid(String s,int low,int high, int n){
        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0,n=s.length();
        int low=0,high=n-1;
        boolean firstNotEqualFound=false;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                if(firstNotEqualFound==false){
                    firstNotEqualFound=true;
                    if(s.charAt(low+1)==s.charAt(high)){
                        if(valid(s,low+1,high,n)==true){
                            return true;
                        }
                    }
                    if(s.charAt(low)==s.charAt(high-1)){
                        return valid(s,low,high-1,n);
                    }
                    else{
                        return false;
                    }
                }
            }
            else{
                low++;
                high--;
            }
        }
        return true;
    
    }
}
class Solution {
    public boolean makePalindrome(String s) {
        int i,n=s.length(),low=0,high=n-1,changed=0;
        while(low<=high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }
            else{
                changed+=1;
                if(changed>2){
                    return false;
                }
                else{
                    low++;
                    high--;
                }
            }
        }
        return true;
    }
}
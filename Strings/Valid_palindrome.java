class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int i,n=s.length();
        for(i=0;i<n;i++){
            if(Character.isLetterOrDigit(s.charAt(i))==true){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        n=sb.length();
        for(i=0;i<n/2;i++){
            if(sb.charAt(i)!=sb.charAt(n-i-1)){
                return false;
            }
        }
        return true;
       
    }
}
class Solution {
    public int titleToNumber(String columnTitle) {
        int i,n=columnTitle.length();
        int res=0,p=0;
        for(i=n-1;i>=0;i--){
            res+=((int)Math.pow(26,p)*((columnTitle.charAt(i)-'A')+1));
            p++;
        }
        return res;
    }
}
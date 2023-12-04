class Solution {
    public String largestGoodInteger(String num) {
        int i=0,n=num.length(),l,sum=0,count=1;
        int maxi=-1;
        StringBuilder sb=new StringBuilder();

        for(i=1;i<n;i++){
            if(num.charAt(i)==num.charAt(i-1)){
                count+=1;
                if(count==3){
                    maxi=Math.max(maxi,num.charAt(i)-'0');
                    count=1;
                }
            }
            else{
                count=1;
            }
        }
        if(maxi==-1){
            return "";
        }
        for(i=0;i<3;i++){
            sb.append((char)('0'+maxi));
        }
        return sb.toString();
    }
}
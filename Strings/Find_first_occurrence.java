class Solution {
    public int strStr(String haystack, String needle) {
        boolean found=false;
        int out=-1;
        int i=0,j=0,n=haystack.length(),m=needle.length();
        if(m>n){
            return -1;
        }
        while(i<n){
            if(needle.charAt(j)==haystack.charAt(i)){
               System.out.println("i: "+i);
                System.out.println("j: "+j);
                int temp1=i;
                int temp2=j;
                while(temp1<n && temp2<m){
                    if(needle.charAt(temp2)==haystack.charAt(temp1)){
                        temp1++;
                        temp2++;
                    }   
                    else{
                     
                        j=0;
                        break;
                    }
                }
                if(temp2==m){
                    out=i;
                    found=true;
                    return out;
                }
                else{
                    i+=1;
                }
            }
            else{
                i++;
            }
        }
        return out;
    }
}
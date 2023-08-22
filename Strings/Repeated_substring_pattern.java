class Solution {
    public boolean checksubstring( int len, String s){
        int i=0,k=len,n=s.length(),j=len;
        while(j<n){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i+=1;
            j+=1;
            if(i==len){
                i=0;
            }
        }
        return true;

    }
    public boolean repeatedSubstringPattern(String s) {
        int i=0,j=1,n=s.length(),substrlen=1;
        boolean flag=false;
        if(n==1){
            return false;
        }
        boolean res=false;
        int len=1;
        for(len=1;len<=(n/2);len++){
            if(n%len!=0){
                continue;
            }
            if(checksubstring(len,s)==true){
                return true;
            }
        }
        return false;
        
        
    }
}
class Solution {
    public String findans(String x){
        int n=x.length(),i=0,j=0;
        String out="";
        while(i<n){
            int count=1;
            char c=x.charAt(i);
            j=i+1;
            while(j<n){
                if(x.charAt(j)==c){
                    count+=1;
                    j++;
                }
                else{
                    break;
                }
            }
            out+=count+""+c;
            i=j;
        }
        
        return out;
    }
    public String countAndSay(int n) {
        String st="1",out="";
        if(n==1){
            return st;
        }
        while(n>0){
            out=st;
            st=findans(st);
            n--;
        }
        return out;
    }
}
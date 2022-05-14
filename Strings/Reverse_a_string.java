public class Solution {
    public String solve(String A) {
        int n=A.length();
        int i=0,j=n-1;
        StringBuilder sb=new StringBuilder();
        int high=0,low=0;
        while(i<n){
            if(A.charAt(i)==' '){
                i+=1;
            }
            else{
                break;
            }
        }
        while(j>=0){
            if(A.charAt(j)==' '){
                j-=1;
            }
            else{
                break;
            }
        }
        int t=i;
        while(t<=j){
            if(A.charAt(t)!=' '){
                sb.append(A.charAt(t));
                t++;
            }
            else if(A.charAt(t)==' '){
                sb.append(A.charAt(t));
                int y=t+1;
                while(y<=j){
                    if(A.charAt(y)==' '){
                        y+=1;
                        continue;
                    }
                    else{
                        break;
                    }
                }
                t=y;
            }
        }
        i=0;
        j=sb.length()-1;
        while(i<j){
         char c=sb.charAt(j);
         sb.setCharAt(j,sb.charAt(i));
         sb.setCharAt(i,c);
         i+=1;
         j-=1;
        }
        i=0;
        j=0;
        int m=sb.length()-1;
        while(j<=m+1){
            if(j<=m && sb.charAt(j)!=' '){
                j+=1;
            }
            else if(j==m+1 || sb.charAt(j)==' '){
                high=j-1;
                low=i;
                while(low<high){
                    char c=sb.charAt(high);
                    sb.setCharAt(high,sb.charAt(low));
                    sb.setCharAt(low,c);
                    low++;
                    high--;
                }
                i=j+1;
                j=j+1;
            }
        }
        return sb.toString();

    }
}


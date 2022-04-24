public class Solution {
    public String binary(int A){
        StringBuilder sb=new StringBuilder();
        int rem;
        while(A>0){
            rem=A%2;
            sb.append(Integer.toString(rem));
            A=(int)A/2;
        }
        sb.reverse();
        return sb.toString();
    }
    public int binarytodecimal(String s){
        int n=s.length();
        int i;
        int num=0;
        for(i=n-1;i>=0;i--){
            num+=Math.pow(2,n-1-i)*(s.charAt(i)-'0');
        }
        return num;
    }
    public int solve(int A) {
        int i;
        String bin=binary(A);
        int n=bin.length();
        int y=1<<n;
        StringBuilder sb=new StringBuilder();
        for(i=0;i<n;i++){
            if(bin.charAt(i)=='1'){
                sb.append("0");
            }
            else{
                sb.append("1");
            }
        }
        int x=binarytodecimal(sb.toString());
        int res=x^y;
        return res;

    }
}


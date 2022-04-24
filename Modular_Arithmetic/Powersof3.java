public class Solution {
    public String ternary(int n){
        int rem=0;
        StringBuilder sb=new StringBuilder();
        while(n>0){
            rem=n%3;
            sb.append(Integer.toString(rem));
            n=(int)n/3;
        }
        sb.reverse();
        return sb.toString();
    }
    public ArrayList<Integer> solve(int A) {
        int i;
        ArrayList<Integer>out=new ArrayList<Integer>();
        if(A==1){
            out.add(1);
            return out;
        }
        if(A==3){
            out.add(3);
            return out;
        }
        String tern=ternary(A);
        int n=tern.length();
        for(i=n-1;i>=0;i--){
            int t=tern.charAt(i)-'0';
            for(int te=0;te<t;te++){
                out.add((int)Math.pow(3,n-1-i));
            }
        }
        return out;

    }
}

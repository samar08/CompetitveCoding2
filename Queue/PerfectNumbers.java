public class Solution {
    public String solve(int A) {
    int x=0;
    long a=1,b=2;
    Queue<Long>q=new LinkedList<Long>();
    if(A<=2){
        StringBuilder sb=new StringBuilder(Long.toString((long)A));
            sb.reverse();
            String sf=sb.toString();
            String out=A+""+sf;
            return out;
        //return Integer.toString(A);
    }
    q.add(a);
    q.add(b);
    x=1;
    while(x<=A){
        long n=q.remove();
        long num1=n*10+1;
        long num2=n*10+2;
        q.add(num1);
        q.add(num2);
        if(x==A){
            StringBuilder sb=new StringBuilder(Long.toString(n));
            sb.reverse();
            String sf=sb.toString();
            String out=n+""+sf;
            return out;
        }
        x++;
    }
    return "";

    }
}

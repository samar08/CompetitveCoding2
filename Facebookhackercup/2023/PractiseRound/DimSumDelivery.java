import java.util.*;
public class DimSumDelivery {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,r,c,a,b,i=1;
        String out="";
        t=sc.nextInt();
        while(t-->0){
            r=sc.nextInt();
            c=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            if(r==2){
                out="NO";
            }
            else if(c==2){
                out="YES";
            }
            else if(r==c){
                out="NO";
            }
            else if(r>c){
                out="YES";
            }
            else{
                out="NO";
            }
            System.out.println("Case #"+(i++)+": "+out);
        }
    }
}

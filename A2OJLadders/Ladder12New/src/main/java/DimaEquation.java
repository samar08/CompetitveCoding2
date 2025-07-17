import java.util.*;
public class DimaEquation {
static int fd=1;
static int nd=1;
    public static int sumi(long x){
int s=0;
        while(x>0){
        s+=(x%10);
        x=x/10;
        }
        return s;
    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int out=0;
        int maxi=(int)Math.pow(10,9);
        ArrayList<Long> outlist=new ArrayList<>();
        int i=1;

        for(i=1;i<=81;i++){
           long x= b*(long)(Math.pow(i,a))+c;
           if((x>0 && x<(int)(Math.pow(10,9))) && (i==sumi(x))){
               outlist.add(x);
           }
        }
        int size=outlist.size();
        System.out.println(size);
        for(i=0;i<size;i++){
            System.out.print(outlist.get(i)+" ");
        }
    }
}



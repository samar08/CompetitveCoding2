import java.util.Scanner;

public class JzzhuAndSequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long max=(int)(Math.pow(10,9)+7);
        long x=(long)sc.nextInt();
        long y=(long)sc.nextInt();
        int n=sc.nextInt();
        int j=3;
        long z=0;
        double seq=(n/3);
      //  int temp=0;
        boolean flag=false;
        if(n<=2){
            if(n==1){
               // System.out.println(x%max);
                System.out.println(Math.floorMod(x,max));
                flag=true;
            }
            else if(n==2){
               // System.out.println(y%max);
                System.out.println(Math.floorMod(y,max));
                flag=true;
            }
        }
        else{
          //  x=Math.floorMod(x,max);
          //  y=Math.floorMod(y,max);
           if(n%3==0){
               if(seq%2==0){
                   System.out.println(Math.floorMod(x-y,max));
               }
               else{
                   System.out.println(Math.floorMod(y-x,max));
               }
           }
           else if(n%3==1){
               if(seq%2==0){
                   System.out.println(Math.floorMod(x,max));
               }
               else{
                   System.out.println(Math.floorMod(-x,max));
               }
           }
           else{
               if(seq%2==0){
                   System.out.println(Math.floorMod(y,max));
               }
               else{
                   System.out.println(Math.floorMod(-y,max));
               }
           }

        }


    }
}

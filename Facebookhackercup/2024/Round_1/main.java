import java.util.*;
class main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=0;
        int te=0;
        int i;
        while(te<t){
            n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=sc.nextInt();

            }
            double max_speed=-1d;
            for(i=n-1;i>=0;i--){
                
                    max_speed=Math.max(max_speed,(double)(i+1)/b[i]);
                
            }
           // System.out.println("max_speed: "+max_speed);
            boolean flag=true;
            for(i=0;i<n;i++){
                double time=(double)(i+1)/(max_speed);
                if(a[i]>time || b[i]<time){
                    System.out.println("Case #"+(te+1)+": -1");
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println("Case #"+(te+1)+": "+max_speed);
            }

            te++;
        }
    }
}
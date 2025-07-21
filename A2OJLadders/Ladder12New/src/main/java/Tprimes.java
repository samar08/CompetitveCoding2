import java.util.*;

public class Tprimes {
    public static void findallprimes(int[] primes){
        int n=primes.length-1;
        int i,j;
        for(i=2;i<=n;i++){
            if(primes[i]==1 && (long)i*i<=n){
                for(j=i*i;j<=n;j+=i){
                    primes[j]=0;
                }
            }


        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        int i;
        long maxi=Long.MIN_VALUE;
        for(i=0;i<n;i++){
            arr[i]=sc.nextLong();
            maxi=Math.max(maxi,arr[i]);
        }
        int max=(int)Math.pow(maxi,0.5);
        int[]primes=new int[max+1];
        for(i=2;i<=max;i++){
            primes[i]=1;
        }
        findallprimes(primes);
        for(i=0;i<n;i++){
            double val=Math.pow(arr[i],0.5);
            int intval=(int)(val);
            if(val-intval==0 && primes[intval]==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

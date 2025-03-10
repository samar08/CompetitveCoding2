import java.util.*;
public class solution2 {
    public static boolean isPrime(int n){
      
     boolean flag = false;
    int i=2;
    if (n == 0 || n == 1) {
        flag = true;
    }
    while (i <= n / 2) {

      if (n % i == 0) {
        flag = true;
        break;
      }

      ++i;
    }

    if (!flag){
        return true;
    }
    
    else{
        return false;
    }
     
  }

  public static void sieveOfEratosthenes(int n,boolean[] prime)
    {
        
      
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
           
            if (prime[p] == true) {
               
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }

    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int te=0;
        int n=0;
        int[] inputn=new int[t];
        int maxn=0;
        int i;
        int j;
        while(te<t){
            inputn[te]=sc.nextInt();
            maxn=Math.max(maxn,inputn[te]);  
            te++; 
        }
        boolean[] prime=new boolean[maxn+1];
        sieveOfEratosthenes(maxn,prime);
        te=0;
        while(t-->0){
            //System.out.println("Case: "+(te+1));
            HashSet<Integer>set=new HashSet<>();
            int count=0;
            n=inputn[te];
            if(n<=4){
                System.out.println("Case #"+(te+1)+": 0");
            }
            else{
                for(i=2;i<n/2;i++){
                    for(j=i+1;j<n/2;j++){
                        if(prime[i] && prime[j]){
                            if(((long)i+j <=n) && prime[i+j]==true){
                                // System.out.println(i);
                                // System.out.println(j);
                                // System.out.println("222222222222222");
                               set.add(i);
                               set.add(j);
                            }
                        }
                    }
                }
                System.out.println("Case #"+(te+1)+": "+set.size());
                //System.out.println(set.toString());
            }
            te++;

        }
    }
}

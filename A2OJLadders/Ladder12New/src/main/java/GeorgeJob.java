import java.util.*;
public class GeorgeJob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] p=new int[n];
        int i;
        int[]out=new int[n-m+1];
        for(i=0;i<n;i++){
            p[i]=sc.nextInt();

        }
        int low=0,high=0,fi=0;
        int sumi=0;
       for(i=0;i<m;i++){
           sumi+=p[i];
       }
       out[fi++]=sumi;
       for(i=m;i<n;i++){
           sumi-=p[low];
           sumi+=p[i];
           out[fi++]=sumi;
           low++;
       }
       Arrays.sort(out);
       // System.out.println(out);
       int osize=n-m+1;
       int outsum=0;
       while(k>0){
           outsum+=out[(osize--)-1];
          // System.out.println(out[(osize--)-1]);
      k--;
       }
        System.out.println(outsum);

    }
}

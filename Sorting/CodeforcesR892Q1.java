
import java.util.*;
public class CodeforcesR892Q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,n,i;
        t=sc.nextInt();
        while(t>0){
            n=sc.nextInt();
            int[] arr=new int[n];
            for(i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
           int mid=0;
            boolean possible=false;
            for(i=1;i<n;i++){
                if(arr[i]!=arr[i-1]){
                    possible=true;
                    mid=i;
                    break;
                }
            }
            if(possible==false){
                System.out.println(-1);
            }
            else{
                int lb=mid;
                int lc=n-mid;
                System.out.print(lb+" "+lc);
                System.out.println();
                for(i=0;i<lb;i++){
                    System.out.print(arr[i]+" ");
                }
                 System.out.println();
                for(i=0;i<lc;i++){
                    System.out.print(arr[i+mid]+" ");
                }
                 System.out.println();
            }
            t--;
        }
    }
}


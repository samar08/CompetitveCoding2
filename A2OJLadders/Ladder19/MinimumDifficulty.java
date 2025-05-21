import java.util.*;

public class MinimumDifficulty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int[]arr=new int[n];
        int minindex=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==3){
            System.out.println(arr[2]-arr[0]);
        }
        else{
            for(i=1;i<=n-2;i++){
                int max=Integer.MIN_VALUE;
                for(j=1;j<n;j++){
                    if(i==j){
                        if(max<arr[j+1]-arr[j-1]){
                            max=arr[j+1]-arr[j-1];
                        }
                    }
                    else{
                        max=Math.max(max,arr[j]-arr[j-1]);
                    }
                }
                min=Math.min(min,max);
            }
            System.out.println(min);
        }
    }
}

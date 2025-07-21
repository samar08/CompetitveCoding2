import java.util.*;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int i;
        int[] arr=new int[t];
        for(i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
       // System.out.println(arr[n-1]-arr[0]);
        int index=n-1;
        int min=Integer.MAX_VALUE;
        int st=0;
        while(index<t){
            min=Math.min(min,arr[index]-arr[st]);
            st++;
            index++;
        }
        System.out.println(min);
    }
}

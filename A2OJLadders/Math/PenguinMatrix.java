import java.util.*;
import java.lang.*;

/*
Category: Math

 */

/*approach
First I tried with finding the average and then tried to find the minimum no. of moves
but it didn't work

We have to actually sort the array and find the median because
median is the actual number that will be present in the array
and by turning all the elements to the median gives the minimum no. of moves

consider this array
1,2,2,5,5,5,5,5,9,9,10,10,11

median is 5 and by converting the all the numbers to 5
you can see we will have the minimum no. of moves
there are five 5s so converting them to 5 will have zero moves, in the same way
we will achieve minimum no. of moves by converting all the elements to median
 */
public class PenguinMatrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,d,i,j,k=0;
        n=sc.nextInt();
        m=sc.nextInt();
        d=sc.nextInt();
       // double avg=0d;
        int[] arr=new int[n*m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[k]=sc.nextInt();
              //  avg+=arr[k];
                k++;
            }
        }
    Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        int out=0;
        boolean flag=true;
    int mid=arr[(int)((n*m)/2)];
        for(k=0;k<n*m;k++){
            //min=Math.min(min,findmoves(arr[k], n, m, d, arr));
            if(arr[k]<mid){
                if((mid-arr[k])%d !=0){
                    System.out.println(-1);
                    flag=false;
                    break;
                }
                out+=(mid-arr[k])/d;
            }
            else if(arr[k]>mid){
                if((arr[k]-mid)%d !=0){
                    System.out.println(-1);
                    flag=false;
                    break;
                }
                out+=(arr[k]-mid)/d;
            }
        }
        if(flag==true){
            System.out.println(out);
        }


    }
}



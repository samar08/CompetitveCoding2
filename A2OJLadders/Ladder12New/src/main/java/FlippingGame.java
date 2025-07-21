import java.util.*;

public class FlippingGame {
    public static int countones(int[] arr){
        int n=arr.length;
        int i,ones=0;
        for(i=0;i<n;i++){
            if(arr[i]==1){
                ones++;
            }
        }
        return ones;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        int maxzeros=0;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int co=countones(arr);
        if(co==n){
            System.out.println(n-1);
        }
        else{
           int st=0;
           int end=0;
           int maxst=0;
           int maxend=0;
           int zeros=0;
           int maxreduceones=0;
           int reduceones=0;
           i=0;
           while(i<n){
               if(arr[i]==0){
                   st=i;
                   end=i;
                   zeros=1;
                   reduceones=0;
                   maxzeros=Math.max(maxzeros,zeros);
                   i++;
                   while(i<n && zeros>0){
                       if(arr[i]==0){
                           zeros++;
                           end++;
                           if(zeros>=maxzeros){
                              // System.out.println("zeros: "+zeros);
                               maxzeros=zeros;
                               maxreduceones=reduceones;
                           }
                       }
                       else{
                          reduceones++;
                           zeros--;
                           end++;
                       }
                       i++;
                   }
//                   if(maxzeros>countzeros(maxst,maxend)){
//                       maxst=st;
//                       maxend=end;
//                   }
                  // i++;


               }
               else{
                   i++;
               }
           }
           // System.out.println("co: "+co);
           // System.out.println("maxzeros: "+maxzeros);
            //System.out.println("maxreduceones: "+maxreduceones);
          //  System.out.println("maxst: "+maxst);
           //System.out.println("maxend: "+maxend);
//           for(i=maxst;i<=maxend;i++){
//               if(arr[i]==1){
//                   arr[i]=0;
//               }
//               else{
//                   arr[i]=1;
//               }
//           }
//           int ans=0;
//           for(i=0;i<n;i++){
//               if(arr[i]==1){
//                   ans++;
//               }
//           }
            System.out.println(co+maxzeros);
        }

    }
}

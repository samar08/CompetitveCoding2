import java.util.*;

public class SortTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr2[i]=arr[i];
        }
       // Arrays.sort(arr2);
        boolean sortedflag=true;
        int[] out=new int[2];
        out[0]=0;
        out[1]=0;
        int count=0;
        for(i=1;i<n;i++){
            if((sortedflag==true) && (arr[i]<arr[i-1])){
                if(count>=1){
                    count++;
                    break;
                }
                sortedflag=false;
                out[0]=i-1;

            }
            if(sortedflag==false){
                if(arr[i]>arr[i-1]){
                    out[1]=i-1;
                    count++;
                    sortedflag=true;
                }
                else if(i==n-1){
                    out[1]=i;
                    count++;
                    sortedflag=true;
                }
            }
        }
       // System.out.println(out[0]+" "+out[1]);
        boolean outflag=true;
        if(sortedflag==true && count<=1){
            if(out[0]!=0 && out[1]!=n-1) {
                if (arr[out[0]] > arr[out[1] + 1] || arr[out[1]] < arr[out[0] - 1]) {
                    outflag = false;
                }
            }
                else if(out[0]==0 && out[1]!=n-1){
                    if(arr[out[1]+1]<arr[out[0]]){
                        outflag=false;
                    }
                }
                else if(out[0]!=0 && out[1]==n-1){
                    if(arr[out[0]-1]>arr[out[1]]){
                        outflag=false;
                    }
                }


            if(outflag==true){
                System.out.println("yes");
                System.out.println((out[0]+1)+" "+(out[1]+1));
            }
            else{
                System.out.println("no");
            }

        }
        else{
            System.out.println("no");
        }

    }
}

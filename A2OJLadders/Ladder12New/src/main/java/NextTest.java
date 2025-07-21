import java.util.*;

public class NextTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;

        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        Arrays.sort(arr);
        i=0;
        int k=1;
        boolean found=false;
        while(i<n){
            if(arr[i]!=k){
                System.out.println(k);
                found=true;
                break;
            }
            else{
                k++;
                i++;
            }
        }
        if(found==false){
            System.out.println(k);
        }
    }
}

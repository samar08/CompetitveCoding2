import java.util.*;
public class Problem3 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),t=sc.nextInt(),i;
    String inp=sc.next();
    String[] arr=inp.split("");
    int len=arr.length;
    // for(i=0;i<len;i++){
    //     System.out.print(arr[i]+" ");
    // }
   
   
    while(t>0){
        ArrayList<Integer> swapPos=new ArrayList<>();
        for(i=1;i<len;i++){
            if(arr[i].equals("G") && arr[i-1].equals("B")){
                swapPos.add(i);
            }
        }
        int size=swapPos.size();
        for(i=0;i<size;i++){
            int index=swapPos.get(i);
            arr[index]="B";
            arr[index-1]="G";
        }
        t--;
    }
    StringBuilder sb=new StringBuilder();
    for(i=0;i<len;i++){
        sb.append(arr[i]);
    }
     System.out.println(sb.toString());   
   } 
}

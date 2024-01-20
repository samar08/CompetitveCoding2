import java.util.*;
public class FindPairsWhoseDifferenceisK {
 public static void main(String[] args) {
    
    int[] arr= new int[]{1,8,11,100,111};
    ArrayList<int[]> out=new ArrayList<>();
    int i,n=arr.length;
    int diff=3;
    HashSet<Integer> set=new HashSet<>();
    for(i=0;i<n;i++){
        if(set.contains(arr[i]+diff)==true){
            int[] pair=new int[]{arr[i],arr[i]+diff};
            out.add(pair);
        }
        if(set.contains(arr[i]-diff)==true){
            int[] pair=new int[]{arr[i]-diff,arr[i]};
            out.add(pair);
        }
       
            set.add(arr[i]);
        
    }
    for(int[] res: out){
        System.out.println(res[0]+" "+res[1]);
    }
 }   
}

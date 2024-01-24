
import java.util.*;
import java.io.*;
public class FindAllPermutations {
    public static void findPermutations(ArrayList<Integer> list, int n, ArrayList<Integer> temp, int tempSize,HashSet<Integer> set,int setSize,ArrayList<ArrayList<Integer>> out ){
    
        int i;
        if(setSize==n){
            
            ArrayList<Integer> outTemp=new ArrayList<>();
            for(i=0;i<n;i++){
                outTemp.add(temp.get(i));
            }
            out.add(outTemp);
            return;
        }
        for(i=0;i<n;i++){
            if(set.contains(i)==false){
                temp.add(list.get(i));
                tempSize+=1;
                set.add(i);
                setSize+=1;
                findPermutations(list, n, temp,tempSize, set, setSize, out);
                temp.remove(tempSize-1);
                tempSize-=1;
                set.remove(i);
                setSize-=1;
            }
            
            
        }
        

    }
    public static ArrayList<ArrayList<Integer>> permutations(ArrayList<Integer> list){
        int i,n=list.size();
        ArrayList<ArrayList<Integer>> out=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int setSize=0,tempSize=0;
        ArrayList<Integer> temp=new ArrayList<>();
        if(list.size()==0){
            return out;
        }
        findPermutations(list,n,temp,tempSize,set,setSize,out);
        return out;

    }
    public static void main(String[] args) {
        int i,n,l;
        String filename="./Recursion/inputForFindAllPermutations.txt";
        try{
            Scanner sc=new Scanner(new File(filename));
            String[] input=sc.nextLine().split(",");
            ArrayList<Integer> list=new ArrayList<>();
            n=input.length;
            for(i=0;i<n;i++){
                list.add(Integer.parseInt(input[i]));
                
            }
            ArrayList<ArrayList<Integer>> out=new ArrayList<>();
            out=permutations(list);
            n=out.size();
            int arraySize=out.get(i).size();
            for(i=0;i<n;i++){
               
                for(l=0;l<arraySize;l++){
                    System.out.print(out.get(i).get(l)+" ");
                }
               System.out.println();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
     
    }
}

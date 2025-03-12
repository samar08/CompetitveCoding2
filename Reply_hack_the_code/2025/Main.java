import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws Exception{
        String filename="0-demo.txt";
        File file=new File(filename);
        Scanner sc=new Scanner(file);
        int i=0,D=0,R=0,T=0;
        ArrayList<String[]>Rlist=new ArrayList<>();
        ArrayList<Integer>minarr=new ArrayList<>();
        ArrayList<Integer>maxarr=new ArrayList<>();
        ArrayList<Integer>profitarr=new ArrayList<>();
        while(sc.hasNextLine()){
            if(i==0){
                String[] arr=sc.nextLine().split(" ");
                D=Integer.parseInt(arr[0]);
                R=Integer.parseInt(arr[1]);
                T=Integer.parseInt(arr[2]);
                
            }
            else if(i<=R){
                String[] temp=sc.nextLine().split(" ");
                Rlist.add(temp);
            }
            else{
                String[] turnarr=sc.nextLine().split(" ");
                minarr.add(Integer.parseInt(turnarr[0]));
                maxarr.add(Integer.parseInt(turnarr[1]));
                profitarr.add(Integer.parseInt(turnarr[2]));
            }
            i++;
        }
        //System.out.println(minarr.get(5)+" "+maxarr.get(5)+" "+profitarr.get(5));
       // System.out.println(Rlist.get(0)[7]);
    }
}
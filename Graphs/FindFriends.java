/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {

    public static void find(int a, ArrayList<Integer> aFriends, int b, HashSet<Integer> visited,HashMap<Integer,ArrayList<Integer>> map, ArrayList<Integer> out){
        int i,n=aFriends.size();
       
        if(n==0){
            return;
        }
        else{
            for(i=0;i<n;i++){
                if(visited.contains(aFriends.get(i))==false){
                    visited.add(aFriends.get(i));
                    if(aFriends.get(i)==b){
                        System.out.println("a: "+a);
                        out.add(a);
                    }
                    else{
                    ArrayList<Integer> friends=map.getOrDefault(aFriends.get(i),new ArrayList<Integer>());  
                        
                        find((int)aFriends.get(i),friends,b,visited,map,out);
                        
                    }
                }
                 
                

            }
        }
        return;
        
    }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
         int i,j;
         
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] list=new int[n];
        for(i=0;i<n;i++){
           list[i]= sc.nextInt();
        }
        int e=sc.nextInt();
       
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        HashSet<Integer> visited=new HashSet<>();
        ArrayList<Integer> out=new ArrayList<Integer>();
        for(i=0;i<e;i++){
                int u=sc.nextInt();
                int v=sc.nextInt();
                ArrayList<Integer> friends=map.getOrDefault(u,new ArrayList<Integer>());
                friends.add(v);
                map.put(u,friends);

        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(map.containsKey(a)){
            ArrayList<Integer> aFriends=map.get(a);
            visited.add(a);
            if(aFriends!=null){
                find(a, aFriends,b,visited,map,out);
            }
        }
        int outSize=out.size();
        for(i=0;i<outSize;i++){
            System.out.print(out.get(i)+" ");
        }
        System.out.println();

        

    }
}

import java.util.Scanner;

import java.util.*;
public class ApplemanCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        TreeMap<Character,Integer>map=new TreeMap<>();
        int i;
        long out=0;
        for(i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
       ArrayList<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(o1.getValue()>o2.getValue()){
                    return -1;
                }
                else if(o1.getValue()==o2.getValue()){
                    return 0;
                }
                else{
                    return 1;
                }
            }
        });
        i=0;
        int m=list.size();
        while(i<m && k>0){
            if(list.get(i).getValue()>=k){
                out+=((long)k*k);
                k=0;
            }
            else if(list.get(i).getValue()<k){
                out+=((long)list.get(i).getValue()*list.get(i).getValue());
                k-=list.get(i).getValue();
            }
            i++;
        }
        System.out.println(out);


    }
}

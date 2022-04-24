import java.lang.*;
import java.util.*;
public class Solution {
    public String binary(int n,int b){
        StringBuilder sb=new StringBuilder();
        int rem,i;
        while(n>0){
            rem=n%2;
            sb.append(Integer.toString(rem));
            n=(int)n/2;
        }
        int diff=b-sb.length();
         for(i=0;i<diff;i++){
             sb.append("0");
         }
         sb.reverse();
         return sb.toString();


    }
    public int solve(ArrayList<Integer> A) {
        long maxint=(long)Math.pow(10,9)+7;
        long ans=0,prod;
        int maxi=-1;
        int i,j;
        int n=A.size();
        for(i=0;i<n;i++){
            maxi=Math.max(maxi,A.get(i));
        }
        int b=(int)(Math.log(maxi) / Math.log(2));
        b+=1;
        int[] lastseenindex=new int[b];
        //System.out.println("b "+b);
        for(i=0;i<n;i++){
           String bin=binary(A.get(i),b);
          // System.out.println("bin "+bin);
           for(j=b-1;j>=0;j--){
               prod=0;
               if(bin.charAt(j)=='1'){
               prod=(((long)(Math.pow(2,b-j-1))%maxint)*((i+1)%maxint))%maxint;
               lastseenindex[b-j-1]=i+1;
               }
               else if(lastseenindex[b-j-1]!=0){
                 prod=(((long)(Math.pow(2,b-j-1))%maxint)*((lastseenindex[b-j-1])%maxint))%maxint;  
               }
                ans=ans+prod;
           }


        }
        ans=ans%maxint;
        return (int)ans;
        
        //return b;
    }
}

/*
Directly string addition can also be done for this problem
Implement direct string addition in free time

*/
import java.util.*;
import java.lang.*;
public class Solution {
    public long converttodecimal(String a){
        long res=0;
        int n=a.length();
        int i,k=0;
        for(i=n-1;i>=0;i--){
           long val=(long)Math.pow(2,k)*(a.charAt(i)-'0');
           res+=val;
           k+=1;
        }
        return res;
    }
    public String converttobinary(long res){
        if(res==0){
            return "0";
        }
       // String out="";
        StringBuilder sb = new StringBuilder();
        while(res>0){
            int rem=(int)(res%2);
            sb.append(Integer.toString(rem));
            res=(long)(res/2);
        }
        //sb.append(out);
        sb.reverse();
        String newout=sb.toString();
        return newout;
    }
    public String addBinary(String A, String B) {
        long a=converttodecimal(A);
        long b=converttodecimal(B);
        long res=a+b;
        return converttobinary(res);
    }
}

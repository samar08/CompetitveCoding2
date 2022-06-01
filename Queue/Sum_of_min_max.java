import java.lang.*;
import java.util.*;
public class Solution {
    public ArrayList<Integer> maximum(ArrayList<Integer> A, int B){
           int n=A.size();
        int maxi=Integer.MIN_VALUE;
        ArrayList<Integer>out=new ArrayList<Integer>();
        Deque<Integer> deque=new LinkedList<Integer>();
        int i;
        if(B>n){
            for(i=0;i<n;i++){
                maxi=Math.max(maxi,A.get(i));
            }
            out.add(maxi);
            return out;

        }
        else{
            for(i=0;i<B;i++){
                if(deque.isEmpty()==true){
                    deque.addLast(i);
                }
                else{
                    while( deque.isEmpty()==false && A.get(i)>=A.get(deque.getLast())){
                        deque.removeLast();
                      
                    }
                    deque.addLast(i);
                    
                }
                
            }
            out.add(A.get(deque.peek()));
            for(i=B;i<n;i++){
                while( deque.isEmpty()==false && A.get(i)>=A.get(deque.getLast())){
                        deque.removeLast();
                      
                    }
                    if(deque.isEmpty()==false){
                        if(i>=deque.peek()+B){
                            deque.removeFirst();
                        }
                    }
                    
                        deque.addLast(i);
                    
                    out.add(A.get(deque.peek()));
            }
        }
        return out;
    }
    public ArrayList<Integer> minimum(ArrayList<Integer> A, int B){
           int n=A.size();
        int maxi=Integer.MIN_VALUE;
        ArrayList<Integer>out=new ArrayList<Integer>();
        Deque<Integer> deque=new LinkedList<Integer>();
        int i;
        if(B>n){
            for(i=0;i<n;i++){
                maxi=Math.max(maxi,A.get(i));
            }
            out.add(maxi);
            return out;

        }
        else{
            for(i=0;i<B;i++){
                if(deque.isEmpty()==true){
                    deque.addLast(i);
                }
                else{
                    while( deque.isEmpty()==false && A.get(i)<=A.get(deque.getLast())){
                        deque.removeLast();
                      
                    }
                    deque.addLast(i);
                    
                }
                
            }
            out.add(A.get(deque.peek()));
            for(i=B;i<n;i++){
                while( deque.isEmpty()==false && A.get(i)<=A.get(deque.getLast())){
                        deque.removeLast();
                      
                    }
                    if(deque.isEmpty()==false){
                        if(i>=deque.peek()+B){
                            deque.removeFirst();
                        }
                    }
                    
                        deque.addLast(i);
                    
                    out.add(A.get(deque.peek()));
            }
        }
        return out;
    }
    public int solve(ArrayList<Integer> A, int B) {
        long maxi=(long)Math.pow(10,9)+7;
        ArrayList<Integer>out1=maximum(A,B);
        ArrayList<Integer>out2=minimum(A,B);
        int i,n=out1.size();
        long sum=0;
        for(i=0;i<n;i++){
            sum=(sum%maxi+out1.get(i)%maxi+out2.get(i)%maxi)%maxi;
        }
        while(sum<0){
             sum=(sum+maxi);
        }
       
        return (int)(sum%maxi);

    }
}

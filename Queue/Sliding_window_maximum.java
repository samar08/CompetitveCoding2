public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
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
}

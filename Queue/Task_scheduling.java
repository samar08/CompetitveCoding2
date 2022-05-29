public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n=A.size();
        Queue<Integer>q=new LinkedList<Integer>();
        int i;
        for(i=0;i<n;i++){
            q.add(A.get(i));
        }
        int j=0;
        int cycles=0;
        for(j=0;j<n;j++){
            while(B.get(j)!=q.peek()){
                int d=q.remove();
                q.add(d);
                cycles+=1;
            }
            q.remove();
            cycles+=1;
            
        }
        return cycles;

    }
}

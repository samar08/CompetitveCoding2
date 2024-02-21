public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int f) {
        ArrayList<Integer> out=new ArrayList<>();
        PriorityQueue<Integer> q=new PriorityQueue<>();
        int i,n=A.size();
        for(i=0;i<n;i++){
            if(i<=f){
                q.add(A.get(i));
            }
            else{
                out.add(q.poll());
                q.add(A.get(i));
            }
        }
        while(q.isEmpty()==false){
            out.add(q.poll());
        }
        return out;
    }
}

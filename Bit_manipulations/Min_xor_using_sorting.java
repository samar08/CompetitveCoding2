public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A,new Comparator<Integer>(){
        public int compare(Integer a,Integer b){
            if(a>b){
                return 1;
            }
            else{
                return -1;
            }
        }
        });
        int n=A.size();
        int i;
        int minxor=0;
        for(i=0;i<n-1;i++){
          if(i==0){
              minxor=A.get(i)^A.get(i+1);
          }
          else{
              minxor=Math.min(minxor,A.get(i)^A.get(i+1));
          }
        }
        return minxor;
    }
}

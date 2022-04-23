public class Solution {
    public String solve(ArrayList<Integer> A) {
        int xor=0;
        int i,n=A.size();
        int numodds=0;
        for(i=0;i<n;i++){
           
            if(A.get(i)%2==1){
                numodds+=1;
                 xor=xor^A.get(i);
            }
        }
        if(xor==0 || xor%2==0 || numodds%2==0){
            return "Yes";
        }
        else{
            return "No";
        }
        //return "No";
        
}
}
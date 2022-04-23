public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int xor=0;
        int i,n=A.size();
        for(i=0;i<n;i++){
            xor=xor^A.get(i);
        }
        int xora=0;
        int xorb=0;
        int b=xor^(xor&(xor-1));
        // b is nothing but rightmost set bit of xor.
        for(i=0;i<n;i++){
            if((int)(b&A.get(i))>0){
                xora=xora^A.get(i);
            }
            else{
                xorb=xorb^A.get(i);
            }
        }
        ArrayList<Integer>out=new ArrayList<Integer>();
        if(xora<xorb){
         out.add(xora);
        out.add(xorb);
        }
        else{
            out.add(xorb);
        out.add(xora);
        }
        
        return out;
    }
}

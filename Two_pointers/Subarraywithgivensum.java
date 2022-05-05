public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n=A.size();
        int i=0,j=0;
        boolean found=false;
        ArrayList<Integer>out=new ArrayList<Integer>();
        int sumi=0;
        sumi+=A.get(j);
        while(j<n){
            if(sumi==B){
                found=true;
                for(int k=i;k<=j;k++){
                    out.add(A.get(k));
                }
                return out;
            }
            else if(sumi>B){
                if(i==j){
                    sumi-=A.get(i);
                    i+=1;
                    j+=1;
                    if(j<n)
                    sumi+=A.get(j);
                }
                else{
                    sumi-=A.get(i);
                    i+=1;
                }
            }
            else if(sumi<B){
                j++;
                if(j<n)
                sumi+=A.get(j);
            }

        }
        if(found==false){
            out.add(-1);
        }
        return out;
    }
}


public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n=A.size();
        int i,j;
        ArrayList<Integer>out=new ArrayList<Integer>();
        int c=1;
        i=n-1;
        j=0;
        int start_index=0;
        while(j<=n-1){
            if(A.get(j)>0){ 
             start_index=j;
             break;
            }
            j+=1;
        }
        if(j>=n){
            out.add(1);
            return out;
        }
        while(i>=start_index){
            int sumi=A.get(i)+c;
            int rem=sumi%10;
            c=(int)(sumi/10);
            if(i!=start_index){
                  out.add(rem);
            }
            else if(i==start_index){
                out.add(rem);
                if(c>=1){
                 out.add(c);
                }
            }
            i-=1;
        }
        int k=out.size();
        for(i=0;i<(int)k/2;i++){
            int temp=out.get(i);
            out.set(i,out.get(k-i-1));
            out.set(k-1-i,temp);
        }
        return out;
    }
}

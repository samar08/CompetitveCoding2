public class Solution {
    public int numSetBits(int A) {
        int count=0;
        while(A>0){
            count+=1;
            A=A&(A-1);
        }
        return count;
    }
}

public class Solution {
    public void reverse(ArrayList<Integer> A,int i,int n){
        int low=i;
        int high=n;
        while(low<high){
            int temp=A.get(high);
            A.set(high,A.get(low));
            A.set(low,temp);
            low+=1;
            high-=1;
        }
    }
    public void swap(ArrayList<Integer> A,int i,int j){
        int temp=A.get(i);
        A.set(i,A.get(j));
        A.set(j,temp);
    }
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int n=A.size();
        int i,j;
        if(A.size()==0 || A.size()==1){
            return A;
        }
        i=A.size()-2;
        while(i>=0 && A.get(i)>=A.get(i+1)){
            i-=1;
        }
        if(i>=0){
            j=A.size()-1;
            while(A.get(j)<=A.get(i)){
                j-=1;
            }
            swap(A,i,j);
        }
        reverse(A,i+1,n-1);
        return A;
    }
}

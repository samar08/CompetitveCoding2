/*
 *Q) We are given an array of integers and a range, we need to find whether the subarray which falls in this range has values in the form of a mountain or not. All values of the subarray are said to be in the form of a mountain if either all values are increasing or decreasing or first increasing and then decreasing. More formally a subarray [a1, a2, a3 … aN] is said to be in form of a mountain if there exists an integer K, 1 <= K <= N such that,
a1 <= a2 <= a3 .. <= aK >= a(K+1) >= a(K+2) …. >= aN
You have to process Q queries. In each query you are given two integer L and R, denoting starting and last index of the subarrays respectively.
 


*/
class Solution {
    public ArrayList<Boolean> processQueries(int[] a, int n, ArrayList<Pair> queries,
                                      int q) {
        // code here
        int[] left=new int[n];
        int[] right=new int[n];
        int i,temp=0;
        ArrayList<Boolean> out=new ArrayList<>();
        left[0]=0;
        right[n-1]=n-1;
        for(i=1;i<n;i++){
            if(a[i]>a[i-1]){
                temp=i;
            }
            left[i]=temp;
        }
        temp=n-1;
        for(i=n-2;i>=0;i--){
            if(a[i]>a[i+1]){
                temp=i;
            }
            right[i]=temp;
        }
        for(i=0;i<q;i++){
            int l=queries.get(i).l;
            int r=queries.get(i).r;
            if(right[l]>=left[r]){
                out.add(true);
            }
            else{
                out.add(false);
            }
        }
        return out;
    }
}
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
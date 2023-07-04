class Solution {
    public int[][] merge(int[][] intervals) {
        int i=0,n=intervals.length;
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0]>b[0]){
                    return 1;
                }
                else if(a[0]==b[0]){
                    if(a[1]>b[1]){
                        return 1;
                    }
                    else if(a[1]==b[1]){
                        return 0;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        });
        int[] arr=new int[]{intervals[0][0],intervals[0][1]};
        ArrayList<int[]>out=new ArrayList<int[]>();
       while(i<n){
            if(intervals[i][0]<=arr[1]){
                arr[1]=Math.max(arr[1],intervals[i][1]);
                i++;
            }
            else{
                out.add(arr);
                arr=new int[]{intervals[i][0],intervals[i][1]};
            }
        }
        out.add(arr);
        int m=out.size();
        int[][] outarr=new int[m][2];
        for(i=0;i<m;i++){
            outarr[i][0]=out.get(i)[0];
            outarr[i][1]=out.get(i)[1];
        }
        return outarr;
    
    }
}
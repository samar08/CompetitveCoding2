class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length,i;
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[1]>b[1]){
                    return 1;
                }
                else if(a[1]==b[1]){
                    if(a[0]>b[0]){
                        return 1;
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
        int st=intervals[0][0];
        int end=intervals[0][1];
        int count=0;
        for(i=1;i<n;i++){
            if(intervals[i][0]>=end){
                st=intervals[i][0];
                end=intervals[i][1];
            }
            else{
                count+=1;
            }
        }
        return count;

    }
}
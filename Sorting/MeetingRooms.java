class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        int i,n=intervals.length;
        if(n==0){
            return true;
        }
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
        int st=intervals[0][0];
        int end=intervals[0][1];
       
        for(i=1;i<n;i++){
            if(intervals[i][0]<end){
                return false;
            }
            end=intervals[i][1];
        }
        return true;

    }
}
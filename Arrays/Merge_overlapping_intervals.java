class Solution {
    public int[][] merge(int[][] intervals) {
        int i,n=intervals.length;
       
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        // for(i=0;i<n;i++){
        //     System.out.println(intervals[i][0]+" "+intervals[i][1]);
        // }
    ArrayList<int[]>arr=new ArrayList<int[]>();
    i=0;
    int start=intervals[i][0];
    int end=intervals[i][1];
    for(i=0;i<n;i++){
        if(intervals[i][0]<=end){
            end=Math.max(end,intervals[i][1]);
        }
        else{
            arr.add(new int[]{start,end});
            start=intervals[i][0];
            end=intervals[i][1];
        }
    }
    arr.add(new int[]{start,end});
    int[][] out=new int[arr.size()][2];
    for(i=0;i<arr.size();i++){
        out[i]=arr.get(i);
    }
   return out;
    }
}
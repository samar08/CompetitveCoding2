
class Solution {
    public int check(long mid,int[] time,int n,int trips){
        int i;
        long sum=0,ltrips=(long)trips;
        for(i=0;i<n;i++){
            sum+=(long)(mid/time[i]);
        }
        if(sum==ltrips){
            return 0;
        }
        else if(sum>ltrips){
            return 1;
        }
        else{
            return -1;
        }
    }
    public long minimumTime(int[] time, int totalTrips) {
        int n=time.length,i=0,maxi=0;
        double sum=0;
        for(i=0;i<n;i++){
        maxi=Math.max(maxi,time[i]);
        sum+=(double)(1.0d/time[i]);
        }
        //System.out.println("sum: "+sum);
        long low=(long)Math.ceil((double)(totalTrips/sum));
   // return low;
    
        long high=(long)maxi*totalTrips,out=-1;
        int xsum=0;
        while(low<=high){
            long mid=low+(long)((high-low)/2);
            int res=check(mid,time,n,totalTrips);
            if(res==0){
                high=mid-1;
                if(out==-1){
                    out=mid;
                }
                else{
                     out=Math.min(out,mid);
                }
            }
            else if(res==1){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(out==-1){
            return low;
        }
        else{
            return out;
        }     
    }
}
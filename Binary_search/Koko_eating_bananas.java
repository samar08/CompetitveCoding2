class Solution {
    public int check(int val,int[] piles,int n,int h){
        int i;
        long lh=(long)h;
        long tot=0;
        for(i=0;i<n;i++){
            //System.out.println((piles[i]/val));
             tot+=(long)Math.ceil(((double)piles[i]/val));
        }
        System.out.println("tot: "+ tot);
        if(tot==lh){
            return 0;
        }
        else if(tot>lh){
            return 1;
        }
        else{
            return -1;
        }
       
    }
    public int minEatingSpeed(int[] piles, int h) {
        int i,n=piles.length,maxi=piles[0];
        for(i=1;i<n;i++)
        maxi=Math.max(maxi,piles[i]);

        if(n==h){
            return maxi;
        }
        int low=1,high=maxi,mid,out=-1;
        while(low<=high){
            mid=low+(int)((high-low)/2);
            System.out.println("mid: "+mid);
            int res=check(mid,piles,n,h);
            
            if(res==0){
                high=mid-1;
                if(out==-1){
                    out=mid;
                }
                else{
                    out=Math.min(mid,out);
                }
                
                
            }
            else if(res==1){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(out!=-1){
            return out;
        }
        else{
            return low;
        }
        
    }
}
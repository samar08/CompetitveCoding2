class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0,n=arr.length,val=1,miss=0;
        while(i<n && k>0){
            if(arr[i]!=(val)){
                miss=val;
                k-=1;
                int j=i;
                val+=1;
                while(k>0){
                    
                    if(arr[j]!=val){
                        k-=1;
                        miss=val;
                        val+=1;
                    }
                    else{
                        val+=1;
                        break;
                    }
                }
                if(k==0){
                    return miss;
                }
                else{
                    i=j+1;
                    continue;
                }
            }
            else{
                val+=1;
            }
            if(k==0){
                return miss;
            }
            i+=1;
        }
        while(k>0){
            miss=val;
            val+=1;
            k-=1;
        }
        return miss;
    }
}
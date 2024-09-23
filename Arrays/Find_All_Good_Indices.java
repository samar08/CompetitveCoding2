class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int i,n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int lefti=-1;
        int righti=-1;
        ArrayList<Integer>out=new ArrayList<>();
        if(n==3){
            out.add(1);
            return out;
        }
        if(k==1){
            for(i=1;i<n-1;i++){
                out.add(i);
            }
            return out;
        }
        
        for(i=0;i<n;i++){
            if(i==0){
                left[i]=-1;
            }
            else{
                if(nums[i]<=nums[i-1]){
                    if(lefti==-1){
                        lefti=i-1;
                    }
                    
                    left[i]=lefti;
                }
                else{
                    lefti=-1;
                    left[i]=-1;
                }
            }
        }
        for(i=n-1;i>=0;i--){
            if(i==n-1){
                righti=-1;
            }
            else{
                if(nums[i]<=nums[i+1]){
                    if(righti==-1){
                        righti=i+1;
                        
                    }
                    right[i]=righti;
                }
                else{
                    righti=-1;
                    right[i]=righti;
                }
            }
        }
        
        for(i=0;i<n;i++){
            if(left[i]!=-1){
                if(i+1>=k && i+1<=n-k){
                    if(i-left[i]+1>=k){
                        if(i+2<n){
                            if(right[i+2]!=-1){
                                if(right[i+2]-(i+2)+1>=k){
                                    out.add(i+1);
                                }
                            }
                            
                        }
                    }
                }
            }
        }
        return out;
    }
}
class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        int i=lower,n=nums.length;
        ArrayList<List<Integer>>out=new ArrayList<List<Integer>>();
        if(n==0){
            ArrayList<Integer>temp=new ArrayList<>();
                        temp.add(lower);
                        temp.add(upper);
                        out.add(temp);
                        return out;
        }
        for(i=0;i<n;i++){

            if(nums[i]>lower){
                        ArrayList<Integer>temp=new ArrayList<>();
                        temp.add(lower);
                        temp.add(nums[i]-1);
                        out.add(temp);
                        lower=nums[i]+1;
                    }
                    else{
                        lower++;
                    }

        }
       
    if(n>0 && nums[n-1]<upper){
        ArrayList<Integer>temp=new ArrayList<>();
        temp.add(nums[n-1]+1);
        temp.add(upper);
        out.add(temp);
    }
    return out;
       
    }
}
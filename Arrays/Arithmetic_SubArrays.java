class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n=nums.length;
        int m=l.length;
        int i=0,j=0;
        List<Boolean> output=new ArrayList<Boolean>();
        for(i=0;i<m;i++){
            int low=l[i];
            int high=r[i];
            int[] temp=new int[high-low+1];
            int c=0;
            for(j=low;j<=high;j++){
                temp[c++]=nums[j];                
            }
            Arrays.sort(temp);
            int diff=0;
            int diff2=0;
            boolean flag=true;
            for(j=1;j<c;j++){
                if(j==1){   
                    diff=temp[j]-temp[j-1];
                }
                else{
                    diff2=temp[j]-temp[j-1];
                    if(diff2!=diff){
                        output.add(false);
                        flag=false;
                        break;
                    }
                }
            }
            if(flag==true){
                output.add(true);
            }
        }
        return output;
    }
}
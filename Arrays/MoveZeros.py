class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        n=len(nums)
        zeros=nums.count(0)
        if(zeros==n):
            return
        count=0
        i=0
        while(i<n):
            if(nums[i]!=0):
                nums[count]=nums[i]
                count+=1
                
            i+=1
        for i in range(count,n):
            nums[i]=0

'''
Another solution:
class Solution {
    public void moveZeroes(int[] nums) {
        int i,n=nums.length,first=0,countzeros=0;
        for(i=0;i<n;i++){
            if(nums[i]==0){
                countzeros+=1;
            }
        }
        
        i=0;
        while(i<n-countzeros){
            if(nums[i]==0){
                
                 first=i;
                while(first<n && nums[first]==0){
                    first++;
                }
                int temp=nums[i];
                nums[i]=nums[first];
                nums[first]=temp;
               while(first<n && nums[first]==0){
                    first++;
                }
            }
            else{
                i++;
            }
        }

    }
}
'''           
        
        
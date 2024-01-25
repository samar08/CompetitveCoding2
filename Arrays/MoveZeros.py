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
        
                
        
        
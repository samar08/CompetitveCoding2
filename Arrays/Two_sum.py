class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)
        b={}
        for i in range(n):
            diff=target-nums[i]
            if(diff in b):
                return [i,b[diff]]
            else:
                b[nums[i]]=i
        return []
        
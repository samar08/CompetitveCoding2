class Solution:
    # @param A : list of integers
    # @return a strings
    def solve(self, A):
        n=len(A)
        even=0
        odd=0
        for i in A:
            if(i%2==0):
                even+=1
            else:
                odd+=1
        if(odd%2==0):
            return ("Yes")
        else:
            return ("No")

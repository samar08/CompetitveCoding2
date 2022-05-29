class Solution:
    # @param A : list of integers
    # @param B : list of integers
    # @return an integer
    def solve(self, A, B):
        cnt = 0
        for i in B:
            x = A.index(i)
            if x == 0:
                cnt += 1
                A.pop(0)
            else:
                A = A[x:]+A[:x]
                cnt += x+1
                A.pop(0)            
        return cnt
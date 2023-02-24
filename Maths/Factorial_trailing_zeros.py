class Solution:
    def trailingZeroes(self, n: int) -> int:
        out=0
        p=1
        while(n>0):
            n=n//(5**p)
            out+=n
        return out
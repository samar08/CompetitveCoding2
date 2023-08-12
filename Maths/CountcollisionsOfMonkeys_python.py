class Solution:
    def monkeyMove(self, n: int) -> int:
        high=int(pow(10,9)+7)
        return int((pow(2,n,high)+high-2)%high)
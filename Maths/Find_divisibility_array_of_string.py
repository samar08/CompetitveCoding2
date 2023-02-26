class Solution:
    def divisibilityArray(self, word: str, m: int) -> List[int]:
        n=len(word)
        div=[0 for i in range(n)]
        prevrem=0
        num=0
        for i in range(n):
            num=int(word[i])+(10*prevrem)
            prevrem=num%m
            if(prevrem==0):
                div[i]=1
            else:
                div[i]=0

        return div
        
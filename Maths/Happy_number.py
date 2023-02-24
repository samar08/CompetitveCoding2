class Solution:
    def isHappy(self, n: int) -> bool:
        if(n==1):
            return True
        s=set()
        s.add(n)
        ns=str(n)
        while(True):
            sumi=0
            for c in ns:
                sumi+=(int(c))**2
            if(sumi==1):
                return True
            elif(sumi in s):
                return False
            s.add(sumi)
            #print(sumi)
            ns=str(sumi)
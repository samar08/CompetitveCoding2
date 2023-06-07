class Solution:
    def minFlips(self, a: int, b: int, c: int) -> int:
        ba=bin(a)
        bb=bin(b)
        bc=bin(c)
        ba=str(ba)[2:]
        bb=str(bb)[2:]
        bc=str(bc)[2:]
        la=len(ba)
        lb=len(bb)
        lc=len(bc)
        maxlen=la
        if(lb>maxlen):
            maxlen=lb
        if(lc>maxlen):
            maxlen=lc
        da=maxlen-la
        db=maxlen-lb
        dc=maxlen-lc
        for i in range(da):
            ba="0"+ba
        for i in range(db):
            bb="0"+bb
        for i in range(dc):
            bc="0"+bc
        count=0
        for i in range(maxlen):
            if(bc[i]=="1"):
                if(ba[i]=="0" and bb[i]=="0"):
                    count+=1
            else:
                if(ba[i]=="1"):
                    count+=1
                if(bb[i]=="1"):
                    count+=1
        return count

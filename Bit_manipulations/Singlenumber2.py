class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        n=len(nums)
        arr=[]
        for i in range(n):
            bs=str(bin(nums[i]))
            isneg=False
            if(bs[0]!="-"):
                bs=bs[2:]
            else:
                isneg=True
                bs=bs[3:]
            ls=len(bs)
            zs=32-ls
            bs=("0"*(zs))+bs
            if(isneg==True):
                bs="1"+bs
            else:
                bs="0"+bs
            arr.append(bs)
        
        out=""
        for j in range(33):
            count=0
            for i in range(n):
                if(arr[i][j]=='1'):
                    count+=1
            if(count%3!=0):
                out+="1"
            else:
                out+="0"
        if(out[0]=="1"):
            out=-int(out[1:],2)
        else:
            out=int(out[1:],2)

        #out=int(out,2)
        return out
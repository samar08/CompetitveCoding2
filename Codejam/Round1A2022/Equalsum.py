from sys import stdout
def findsubset(i,csum,subsum,A,n,dp,temp,out):
    if(csum>subsum or i>=n):
        return 0
    
    if(dp[i][csum]!=-1):
        
        return dp[i][csum]
    
    else:
        
        if(csum==subsum):
            dp[i][csum]=1
            for i in temp:
                out.append(i)
            return 1
        else:
            temp.append(A[i])
            op1=findsubset(i+1,csum+A[i],subsum,A,n,dp,temp,out)
            temp.pop(-1)
            if(op1==1):
                dp[i][csum]=1
                return 1
            else:
                
                op2=findsubset(i+1,csum,subsum,A,n,dp,temp,out)
                dp[i][csum]=op2
                return op2
        
    
    

t=int(input())
for te in range(t):
    n=int(input())
    A=[]
    for i in range(n):
        A.append(i+1)
        print(i+1,end=" ")
    stdout.flush()
    #B=list(map(int,input().split(" ")))
    B=[]
    for i in range(n):
        B.append(int(input()))

    A=A+B
    sumi=sum(A)
    subsum=sumi//2
    tn=len(A)
    dp=[]
    for i in range(tn):
        mat=[-1 for j in range(subsum+1)]
        dp.append(mat)
    temp=[]
    out=[]
    #op=findsubset(0,0,subsum,A,tn,dp,temp,out)
    for i in out:
        print(i,end=" ")
    stdout.flush()
        
    

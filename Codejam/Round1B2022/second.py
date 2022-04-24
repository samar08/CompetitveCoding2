from math import *
def fun(x,y):
    if(x[1]>y[1]):
        return x
    elif(x[1]<y[1]):
        return y
    else:
        if(x[0]>y[0]):
            return x
        else:
            return y

t=int(input())
for te in range(t):
    n,p=list(map(int,input().split(" ")))
    mat=[]
    y=0
    for j in range(n):
        if(j==0):
            x=list(map(int,input().split(" ")))
            st=0
            x=sorted(x)
            for i in x:
                y+=abs(st-i)
                st=i
        else:
            #print(st)
            x=list(map(int,input().split(" ")))
            tx=[[i,abs(i-st)] for i in x]
            #print(tx)
            sx=sorted(tx,key=fun(x1,y1))
            #print(sx)
            for i in sx:
                y+=abs(st-i[0])
                st=i[0]
        
            
            
            
        
        # mat.append([[i,0] for i in x])
    #print(mat)
    # temp=mat[0]
    # sorttemp=sorted(temp,x:x[0])
    # y=0
    # for i in range(p):
    #     if(i==0):
    #         x=sorttemp[i][0]
    #         y+=sorttemp[i][0]
    #     else:
    #         y+=abs(x-sorttemp[i][0])
            
            
    
        
    
    print("Case #"+str(te+1)+": "+str(y))
t=int(input())
for te in range(t):
    mat=[]
    out=0
    r=""
    outr=[]
    for p in range(3):
        mat.append(list(map(int,input().split(" "))))
    for i in range(4):
        x=min(mat[0][i],min(mat[1][i],mat[2][i]))
        out+=x
        outr.append(x)
    if(out==1000000):
        
        r=" ".join([str(k) for k in outr])
    elif(out>1000000):
        diff=out-1000000
        #print("diff:",diff)
        if(outr[0]>=diff):
            outr[0]=outr[0]-diff
        elif(outr[1]>=diff):
            outr[1]=outr[1]-diff
        elif(outr[2]>=diff):
            outr[2]=outr[2]-diff
        elif(outr[3]>=diff):
            outr[3]=outr[3]-diff
        else:
            j=0
            while((diff>0) and (j<4) and (diff>outr[j])):
                diff=diff-outr[j]
                outr[j]=0
                j+=1
            if(diff>0 and diff<=outr[j]):
                outr[j]-=diff
                diff=0


        r=" ".join([str(k) for k in outr]) 
    
    else:
        r="IMPOSSIBLE"
    print("Case #"+str(te+1)+": "+r)




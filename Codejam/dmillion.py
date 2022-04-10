t=int(input())
for te in range(t):
    n=int(input())
    s=list(map(int,input().split(" ")))
    out=0
    if(n==1):
        out=1
    else:
        s.sort()
        k=1
        count=0
        maxcount=0
        i=0
        while(i<n):
            if(k<=s[i]):
                count+=1
                k+=1
                i+=1
            else:
                j=i
                while(j<n and s[j]<k):
                    j+=1
                i=j
        out=count
        # for i in range(n):
        #     if(k<=s[i]):
        #         count+=1
        #         k+=1
        #         maxcount=max(maxcount,count)
        #     else:
        #         k=2
        #         count=1
        #         maxcount=max(maxcount,count)
        # out=maxcount

    print('Case #'+str(te+1)+": "+str(out))
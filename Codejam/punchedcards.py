t=int(input())
for te in range(t):
    r,c=list(map(int,input().split(' ')))
    mat=[]
    r1=r*2+1
    c1=c*2+1
    print("Case #"+str(te+1)+":")
    for i in range(r1):
        if(i%2==0):
            if(i<2):
                for j in range(c1):
                    if(j<2):
                        print('.',end="")
                    else:
                        if(j%2==0):
                            print('+',end="")
                        else:
                            print('-',end="")
            else:
                for j in range(c1):
                    if(j%2==0):
                        print('+',end="")
                    else:
                        print('-',end="")
        else:
            if(i<2):
                for j in range(c1):
                    if(j<2):
                        print('.',end="")
                    else:
                        if(j%2==0):
                            print('|',end="")
                        else:
                            print('.',end="")
            else:
                for j in range(c1):
                    if(j%2==0):

                        print('|',end="")
                    else:
                        print('.',end="")
                    
        print()        
            
    
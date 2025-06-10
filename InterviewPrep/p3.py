l=set(["t","i","gg","er"])
s="sggtigigr"
s=s.lower
ns=""
i=0
n=len(s)
remlist=[]
while(i<n):
    if(s[i]=='t' or s[i]=='i'):
        remlist.append(i)
        # s=s.replace(s[i],"")
i=0
while(i<n):
    if(i not in remlist):
        ns+=s[i]
print(ns)
# while(i<n):
#     if(s[i]=='g'):
#         if(s[i+1]=='g'):
#     elif(s[i]=='e'):
#         if(s[i+1]=='r'):
    #if(s[i] in l or s[i:i+1]):
    #    s.replace(s[i],"")


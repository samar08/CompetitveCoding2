def reverse_list(l):
    n=len(l)
    for i in range(n//2):
        temp=l[i]
        l[i]=l[n-i-1]
        l[n-i-1]=temp


lst = ["pooh", "christopher robin", "piglet", "roo", "eeyore"]
reverse_list(lst)
print(lst)
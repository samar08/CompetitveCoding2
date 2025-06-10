'''
understand:
1. is it case sensitive?
2. are they only strings?

plan:
1. use a set to store non-repeated values (or) just compare two index values
2. iterate over the list and check if the current elememnt is present in the set
3. if it's present we will remove using list.remove()
'''
def remove_dupes(items):
    n=len(items)
    if(n<=1):
        return len(items)
    i=1
    while(i<len(items)):
        if(items[i]==items[i-1]):
            items.pop(i)
        else:
            i+=1
    print(items)
    return len(items)
        


items = ["extract of malt", "haycorns", "honey", "thistle", "thistle","samar"]

print(remove_dupes(items))
items = ["extract of malt", "haycorns", "honey", "thistle"]
print(remove_dupes(items))


items = ["extract of malt", "haycorns","honey","honey", "honey", "thistle", "thistle","thistle","samar"]

print(remove_dupes(items))


items = []

print(remove_dupes(items))
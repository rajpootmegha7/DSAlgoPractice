print ("Hello Megha")

hashset = set()
list= [2,2,3,4,5]

for n in list:
    if n in hashset:
        print("Value is duplicated in the list")
    else:
        hashset.add(n)



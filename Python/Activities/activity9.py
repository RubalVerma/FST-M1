list1 = {1,2,3,4,5}
list2 = {6,7,8,9,10}

list3=[]

for even in list1:
    if(even % 2 ==0) :
        list3.append(even)


for odd in list2:
    if(odd % 2 !=0):
        list3.append(odd)
print()
print("Final List with even from 1st list and odd from 2nd list is :")
print(list3)
print()
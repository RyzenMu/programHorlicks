# import copy module to copy a list
# copying List Objects 

# we cannot copy list using assignments , since they both share same address

import copy
list1 = [10, 20, [30, 40]]
list3 = copy.copy(list1) # the copy program creates a shallow copy
list3.append(50)
print(list3)
print(list1)
list1[2][0] = 35
print(list3) # nested objects are same
print(list1)

# for copying nested objectes we use deep copy
list1 = [10, 20, [30, 40]]
list3 = copy.deepcopy(list1)
list1[2][0] = 55
print(list1) # here list 1 and list3 refer to different lists at all levels of nesting
print(list3)

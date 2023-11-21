
# example 1
list1 = ['red', 'green']
list2 = [10, 20, 30]

# multiplication operator *
list_multiply = list2 * 2
print(list_multiply)
list2 = ['q', 'k', 'n', 'a', 7, 987, 334]
list_multiply = list2 * 5
print(list_multiply)

# concatenation operator +
list1 = ['red', 'green']
list2 = [10, 20, 30]
list3 = list2 + list2 + list1
print(list3)

#len operator
print(len(list1))
print(len(list2))
print(len(list3))

#indexing
print(list3[-1])
print(list3[-2])

#slicing
print(list3[-4: -1])
print(list3[-1: -4]) # wrong syntax
print(list3[0:-1:2])


#min max function
list3 = [44, 87, 44, 88, 54, 76]
print(min(list3))
print(max(list3))

# function sum
print(sum(list3))

#membership operator
print(40 in list3)
print(44 in list3)

# in operator
students = ['ram', 'shyam', 'geetha', 'seetha']
for student in students:
    print(student)

# in operator to find marks above 75
marks = [88, 76, 12, 45, 78, 7, 94]
count = 0
for mark in marks:
    if mark > 75:
        count += 1

print(count)


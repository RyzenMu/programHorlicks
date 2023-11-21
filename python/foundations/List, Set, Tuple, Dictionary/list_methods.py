# function append
# function append inserts value at the end
list = [10, 20, 30, 40]
list.append(25)
print(list)

# function extend
# function extend inserts a sequence at the end
list = [10, 20, 30, 40]
list.extend([50, 60, 70, 80])
print(list)
list.extend('kgkhkg')
print(list)

#function count
# function count returns number of times a item is in a list
list = ['j', 'k', 'j', 'k', 'j']
j = list.count('j')
k = list.count('k')
print(j, k)


# function pop
# function pop returns the index value while removing it
list = [10, 20, 30, 40, 10, 20, 30, 40]
p = list.pop(1) # index value should be passed as an argument
print(p)
print(list)
list = ['a', 'b', 'c', 'd', 'e']
p = list.pop(1) # index value should be passed as an argument
print(p)
print(list)

# function remove
# function remove takes the value as argument and removes first instance
list = [10, 20, 30, 40, 10, 20, 30, 40, 10, 20, 30, 40]
i = list.remove(30)
print(i)
print(list)
i = list.remove(30)
print(i)
print(list)
i = list.remove(30)
print(i)
print(list)

# corresponding removal of two arrays
student_name = ['ram', 'shyam', 'geetha', 'sita', 'swetha']
student_rollno = [1, 2, 3, 4, 5]
# removing student 'geetha' and roll no 3
student_rollno.pop(student_name.index('shyam'))
print(student_rollno)
student_name.remove('shyam')
print(student_name)
print(student_name, student_rollno)


# del operator is used to delete a sequence of elements
list = [10, 20, 30, 40, 10, 20, 30, 40]
del list[1:4]
print(list)
del list # removes entire list

# pop with out argument
list = [34, 5, 76, 46, 96]
list.pop() # removes the last index 
print(list)
# list of cubes using normal for loop
# list of cubes using normal for loop
cub = []
for i in range(1, 10):
    res = i ** 3
    cub.append(res)
print(cub)

# list of cubes using list comprehension
cube = [ i**3 for i in range (11, 20)]
print(cube)

# creating a new list out of orginal list i.e. filtering using if condition
students_with_heights = [
    ['amir', 156],
    ['bahmin', 180],
    ['cinderlla', 158],
    ['dohnb', 167],
    ['ester', 170],
]

height = 160
selected_students = [ x for x in (students_with_heights) if x[1] >= height]
print(selected_students)

# cross product in list comprehension
s1 = ['a', 'b', 'c', 'd']
s2 = [3, 5, 7]
cross = [[i, j] for i in s1 for j in s2 ]
print(cross)

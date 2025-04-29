#map
#map
# result = map(function, itrebale object)
# lambda arguments : expression

cube = lambda x : x ** 3
print(cube(3))
quad = lambda x : x ** 4
print(quad(4))

# sum two cubes
sum2cubes = lambda x, y : x **3 + y ** 3
print(sum2cubes(1, 2))
print(sum2cubes(2, 3))

# map list with cube
list1 = [1, 4, 2, 7, 9]
list_cube = list(map(cube, list1))
print(list1)
print(list_cube)

# reduce method is available in func inter tools 
lst = [9, 4, 2, 7]
lst_cube = list(map(lambda x : x ** 3, lst))
import functools # func tools should be imported for using reduce
sum_cube = functools.reduce(lambda x , y : x +y , lst_cube)
print(sum_cube)

# filter method
lst = [1, 2, 3, 4, 5, 6, 7, 8]
list_even = list(filter(lambda x : x % 2 == 0, lst))
print(list_even)

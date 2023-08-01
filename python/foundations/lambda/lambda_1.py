#lambda expression in python

# lambda function is a small anonymous function

#example 1
square = lambda a : a*a
print(square(9)) 

# example 2 - with Multiple arguments
result = lambda a, b, c, d : a*b/c+d
print(result(3, 5, 1, 6))
print(result(8, 7, 8, 9))

# example 3 - lambda function inside another function

def func(n):
    return lambda a : a * n
my_doubler = func(2)
print(my_doubler(20))
print(my_doubler(26))
print(my_doubler(27))
print(my_doubler(28))
my_tripler = func(3)
print(my_tripler(5))
print(my_tripler(6))
print(my_tripler(7))


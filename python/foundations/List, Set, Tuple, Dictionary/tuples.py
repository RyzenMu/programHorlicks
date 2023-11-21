"""
tuple is a non-scalar object
tuple is an ordered sequence
tuple are immutable
can be heterogenous
"""

t1 = (4, 6, [2, 8], 'abc', {3, 4})
print(type(t1))

# if a tuple has only one element then it should be followed by a comma

t2 = (2, )
print(type(t2))

t3 = (1, 2, [3, 4])
t3[2][1] = 9
print(t3)
t3[1] = 5 # gives error as tuples are imutable
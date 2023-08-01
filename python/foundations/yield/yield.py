# yield is an array

def func():
    yield 1
    yield 2
    yield 3

for i in func():
    print(i)
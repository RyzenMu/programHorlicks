# raise type error

x = " This is a string "

# x = 33

if type(x) is not int:
    raise TypeError("Enter a number")
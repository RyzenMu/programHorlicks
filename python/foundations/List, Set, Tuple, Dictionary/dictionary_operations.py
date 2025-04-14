#dictionary operations

digits = {
    0 : 'zero',
    1 : 'one',
    2 : 'two',
    3 : 'three',
    4 : 'four',
    5 : 'five',
    6 : 'six',
    7 : 'seven',
    8 : 'eight',
    9 : 'nine',
}

# function len
print(len(digits))

# function min
print(min(digits))

# function max
print(max(digits))

# function sum
print(sum(digits))

#membership operator
print( 6 in digits)
print ( 11 in digits)

# min, max, sum operations only apply to keys
d = {
    1 : 787,
    2 : 575,
    3 : 942,
    4 : 355,
    5 : 364,
}
print(min(d), max(d), sum(d), 7 in d, 787 in d)

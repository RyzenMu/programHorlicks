# we may remove key-value pair using del operator
# we may remove key-value pair using del operator

winter = {
    11 : 'November', 
    12 : 'December',
    1 : "January",
    2 : "February",
}

del winter[1]
print(winter)

months = winter

print(id(months))
print(id(winter))

del winter

# to remove all key-value pairs
months.clear()
print(months)
print(winter)

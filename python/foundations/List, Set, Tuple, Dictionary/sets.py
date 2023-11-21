# set is an unordered sequence without duplicates
# set is represented by curly brackets {}

set1 = {3, 6, 1, 9, 4, 6, 6, 6, 8, 6}
print(set1) # {1, 3, 4, 6, 8, 9}

vowels = set('aeiou') # strings
print(vowels)

list_vehicles = ['bike', 'car', 'bicycle', 'scooter'] # lists
set_vehicles = set(list_vehicles)
print(set_vehicles)

tuple_numbers = (3, 3, 5, 5,  7, 7, 9, 11) # tuple
set_numbers = set(tuple_numbers)
print(set_numbers)

# sets are immutable 
# int , float, str, tuple can be members of set
# list cannot be member of set

# we cannot access sets using indexing or slicing
# we cannot use + or * operator on sets

# however we can use only in operator on sets
for num in set_numbers:
    print(num)

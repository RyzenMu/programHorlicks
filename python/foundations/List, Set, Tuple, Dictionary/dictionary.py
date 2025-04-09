#dictionary is a unordered sequence of key-value pairs
# dictionary is a unordered sequence of key-value pairs

month = {}
month[1] = "jan"
month[2] = 'feb'
month[3] = "mar"

print(month)
print(type(month))

# example 2
price = {
    'tomato' : 40,
    'cucumber' : 30,
    'potato' : 20,
    'cauliflower' : 70,
    'cabbage' : 50,
    'lettuce' : 40,
    'raddish' : 30,
    'carrot' : 20,
    'peas' : 80
}

print(price.keys())
k = price.keys()
for i in k :
    print(i)

print(price.values())
k = price.values()
for i in k :
    print(i)

print(price.items())
k = price.items()
for i in k :
    print(i)

print(price['cabbage'])

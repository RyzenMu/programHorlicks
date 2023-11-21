# The function tuple is used to convert a sequence to a tuple

vowels = "aeiou"
t1 = tuple(vowels)
print(t1)

num = [4, 10, 20]
t2 = tuple(num)
print(t2)

t3 = tuple(range(10))
print(t3)

# zip function - used to produce zip object (iterable object), whose ithb element is a tuple conatining ith element from each iterable object.
colors = ('red', 'yellow', 'orange')
fruits = ['cherry', 'banana', 'orange']
quantity = ('1 kg', '1.5 kg', '2 kg')
fruitColor = list(zip(colors, fruits))
fruitColor_tuple = tuple(zip(colors, fruits))

print(fruitColor)
print(fruitColor_tuple)

fruitColorQuantity = list(zip(fruitColor, quantity))
print(fruitColorQuantity)

combined = list(zip(colors, fruits, quantity))
print(combined)
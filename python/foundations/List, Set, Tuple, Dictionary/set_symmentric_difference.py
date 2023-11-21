# symmentric differnce is one which apperars only in one set

fruits = {'Apple', 'Orange', 'Watermelon', 'tomato', 'cucumber'}
vegetables = {'tomato', 'cucumber', 'potato', 'Watermelon', 'cauliflower'}

sym_difference = fruits.symmetric_difference(vegetables)
sym_difference_1 = vegetables.symmetric_difference(fruits)
print(sym_difference, sym_difference_1)




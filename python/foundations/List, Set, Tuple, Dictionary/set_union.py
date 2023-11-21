
# function union
fruits = {'Apple', 'Orange', 'Watermelon', 'tomato', 'cucumber'}
vegetables = {'tomato', 'cucumber', 'potato', 'Watermelon', 'cauliflower'}
eatable = fruits.union(vegetables)
print(eatable)

# pipe operator is used for union
programs = {'c++', 'java', 'kotlin', 'rust'}
laptops = {'lenovo', 'dell', 'hp', 'samsung'}
pickup = programs | laptops
print(pickup)
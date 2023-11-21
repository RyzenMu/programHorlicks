# function difference
fruits = {'Apple', 'Orange', 'Watermelon', 'tomato', 'cucumber'}
vegetables = {'tomato', 'cucumber', 'potato', 'Watermelon', 'cauliflower'}

onlyFruits = fruits.difference(vegetables)
print(onlyFruits)

onlyVegetables = vegetables.difference(fruits)
print(onlyVegetables)


mor = {'idly', 'dosa', 'puri', 'vada'}
lunch = {'dosa', 'vada', 'chicken', 'egg'}

onlyMor = mor - lunch
print(onlyMor)

onlyLunch = lunch - mor
print(onlyLunch)
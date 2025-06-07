# the function splits enables us to split the string into partitions based on a delimiter
# the function splits enales us to split the string into partitions based on delimiter
# the function splits enales us to split the string into partitions based on delimiter

str = " toyota, ford, maruthi, hyundai, kia"

carsArray = str.split(',')

for car in carsArray:
    print(car)

# if no delimiter is specified , the program assumes whitespace as delimiter

carsArray = str.split()

for car in carsArray:
    print((car))

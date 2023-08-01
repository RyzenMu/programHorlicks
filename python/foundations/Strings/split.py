# the function splits enables us to split the string into partitions based on a delimiter

str = " toyota, ford, maruthi, hyundai, kia"

carsArray = str.split(',')

for car in carsArray:
    print(car)

# if no delimiter is specified , the program assumes whitespace as delimiter

carsArray = str.split()

for car in carsArray:
    print((car))
# Important keywords in python

#1. Continue

for m in range(21, 55):
    if m % 2 == 0 or m % 3 == 0:
        continue
    print(m, end='-')
print(end="\n")

# 2. Not
for n in range(1, 11):
    if not(n%2 == 0):
        print(n, sep="-", end="-")
print(end="\n")

#4. in keyword
list_1 = ['ara', 'oma', 'skp', 'kus']
for item in list_1:
    item += "//"
    print(item)
if "oma" in list_1:
    print("True True True")

#5 non local




#3. Assert
# assert will give assertion error if a condtion fails
#example 1
assert 10>5
# assert 5>10
#example 2
try:
    assert 10 < 5
except AssertionError:
    print("enter correct number")


#example 2
assert 5 > 10
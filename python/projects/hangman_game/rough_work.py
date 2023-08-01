import time

name = input("enter name : ")
print(name.strip())

guess = input("guess")
index = name.find(guess)
name = name[:index] + "_" + name[index + 1 :]
print(index)
print(name)

ara = [1, 3, 4]
ara.extend([2])
print(ara)




exit()


for i in range(2):
    print(name)
    time.sleep(5)

a = 'www'  
def pr(e):
    global b # global keyword means global scope
    b = 'ttt'
    print(e)

pr(a)
print(b)

print(len(a))

print("-" * 25)


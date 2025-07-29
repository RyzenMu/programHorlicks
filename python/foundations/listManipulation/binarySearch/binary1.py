#binary1.py
import random

# Creating a random number and sorting it

#create a new array
arr = []

#for loop to generate 10 random numbers and store it in the array
for i in range(10):
	ran = random.randint(2, 100)
	arr.append(ran)


print(arr)

def sortingarr(arr):
	for e in range (len(arr)-1):
		for w in range(len(arr)-1):
			if arr[w] > arr[w+1]:
				temp = arr[w]
				arr[w] = arr[w+1]
				arr[w+1] = temp
		
		
sortingarr(arr)


#print array
print(arr)



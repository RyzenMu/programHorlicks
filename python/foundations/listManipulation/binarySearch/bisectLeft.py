
import math

arr = [1, 2, 3,4, 5, 6, 7, 8, 9, 10]

print(arr)

low = 0
high = len(arr)
mid = (low+high)//2

while low < mid:

	if mid %2 == 0:
		mid = (low+high)//2
	
	else:
		mid = (low+high)//2

	print("mid :", mid)
	print("left bisect : ", arr[low:mid])
	print("right bisect : ", arr[mid:high])
	high = mid
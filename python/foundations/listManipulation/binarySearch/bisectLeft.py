arr = [1, 1, 2, 2, 3, 5, 7, 7, 7, 9, 10, 15]

def search(list, x):
	low = 0
	high = len(list)-1
	while low <high:
		mid = (low+high)//2
		if list[mid] <= x:
			low = mid
		else:
			high = mid
	return mid	

result = search(arr, 15)

print("the result is : ", result)
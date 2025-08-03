#binary search using algorithm
list = [2, 4, 6, 8, 10, 12]

def binarySearch(list, num):
	low = 0
	high = len(list)-1
	mid = ((low+high)//2)+1
	if list[mid] == num:
		return True
	elif list[mid] < num:
		low = mid+1
	else:
		high = mid-1	
	binarySearch(list, num)
	return False

result = binarySearch(list, 5)

if result == True:
	print("Number Found")
else:
	print("Number Not Found")

pos = -1

def search(list, n):
	low = 0
	upper = len(list)-1
	while low <= upper:
		mid = (low+upper)//2
		if list[mid] == n:
			globals()['pos'] = mid
			return True
		else:
			if list[mid] < n:
				low = mid+1
			else:
				upper = mid-1
	return False
			

list = [4, 7, 8, 12, 45, 99]

n = 99

if search(list, n):
	print("Found at", pos+1)
else:
	print("Not Found")
#quick sort 1
a = [9, 5, 7, 2, 8, 6, 1, 4, 6]

def quick(array):
	
	for v in range(len(array)):
		l = 1
		h = len(array)-1
		pivot = array[v]
		while l < h+1 and h > l-1:
			print(pivot, " : ", array[l])
			if pivot > array[l] and pivot < array[h]:
				array[l], array[h] = array[h], array[l]
			if l == h:
				pass
			else:
				print(pivot, " : ", array[h])
			l += 1
			h -= 1
		temp = array[h]
		array[v], array[h] = temp, pivot
		

quick(a)
print(a)

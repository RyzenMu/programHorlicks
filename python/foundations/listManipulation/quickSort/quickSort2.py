def quick_sort(sequence):
	length = len(sequence)
	if length <=1:
		return sequence
	else:
		pivot = sequence.pop()
	
	items_greater = []
	items_lower = []
	
	for item in sequence:
		if item > pivot:
			items_greater.append(item)
		else:
			items_lower.append(item)
	
	return quick_sort(items_lower)+[pivot]+quick_sort(items_greater)



print(quick_sort([4,3,3,3,7,5,8,4,1,7,7,4]))
unsorted_array = [21, 38, 29, 17, 4, 25, 11, 32, 9]
sorted_array = []

def sort(list):
	sorted_array.append(unsorted_array[0])
	#unsorted_array.remove(unsorted_array[0])
	
	for l in range(1, len(list)-1):
		if unsorted_array[l] <= unsorted_array[l+1]:
			sorted_array.append(unsorted_array[l])
		else:
			sorted_array.insert(l, unsorted_array[l])
		print(sorted_array)
sort(unsorted_array)
print(sorted_array)
#insertion sort
unsorted_array = [33, 21, 38, 44, 29, 17, 4, 25, 11, 32, 9, 15]
sorted_array = []
'''
def sort(list):
	sorted_array.append(unsorted_array[0])
	#unsorted_array.remove(unsorted_array[0])
	if sorted_array[-1] > unsorted_array[1]:
		sorted_array.insert(0, unsorted_array[1])
	else:
		sorted_array.append(unsorted_array[1])
	if sorted_array[-1] > unsorted_array[2]:
		sorted_array.insert(1, unsorted_array[2])
	else:
		sorted_array.append(unsorted_array[2])
	for g in range(3, len(list)-1):
		if sorted_array[-1] > unsorted_array[g]:
			sorted_array.insert(g-1, unsorted_array[g])
		else:
			sorted_array.append(unsorted_array[g])
		print(sorted_array)
'''

def mid(list, number):
	h = 0
	if list == []:
		list.append(number)
	if list[-1] < number:
		list.append(number)
		return list
	while (list[h] < number):
		h+=1
	list.insert(h, number)
	return list

#result = mid([25, 67, 77], 700)

for i in range(len(unsorted_array)-1):
	mid(sorted_array, unsorted_array[i]) 

print(sorted_array)

		
	


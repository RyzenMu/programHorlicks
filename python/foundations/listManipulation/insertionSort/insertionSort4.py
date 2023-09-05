def insertion_sort(list_a):
	indexing_length = range(1, len(list_a))
	print(indexing_length)
	for i in indexing_length:
		value_to_sort = list_a[i]
		while list_a[i-1] > value_to_sort and i > 0:
			list_a[i], list_a[i-1] = list_a[i-1], list_a[i]
			i = i-1
	return list_a

list_a = [3, 6,8, 3, 5, 1, 8]

print(insertion_sort(list_a))
		
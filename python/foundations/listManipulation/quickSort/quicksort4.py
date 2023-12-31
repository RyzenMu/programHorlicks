def swap(a, b, arr):
	arr[a], arr[b] = arr[b], arr[a]

def partition(elements, start, end):
	pivot_index = start
	pivot = elements[pivot_index]
	
	while start < end:
		while start < len(elements) and elements[start] <= pivot:
			start += 1
		while elements[end] > pivot:
			end -=1
	
		if start < end:
			swap(start, end, elements)
	swap(pivot_index, end, elements)
	return end

def quick_sort(elements, start, end):
	if start < end:
		pi = partition(elements, start, end)
		quick_sort(elements, start, pi-1)
		quick_sort(elements, pi+1, end)

if __name__ == "__main__":
	arr = [4,3,3,3,7,5,8,4,1,7,7,4]
	quick_sort(elements, 0, len(elements)-1)
	print(elements)
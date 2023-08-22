list = [5, 2, 7, 4, 3, 8, 2]

def sort(list, num):
	swapCount = 0
	for r in range(len(list)-1):
		for t in range((len(list)-1)-r):
			if list[t] > list[t+1]:
				temp = list[t]
				list[t] = list[t+1]
				list[t+1] = temp


sort(list, 8)
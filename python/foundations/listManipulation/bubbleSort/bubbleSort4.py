#bubblesort
#bubble sort
list = [1, 2, 3, 4]
list1 = [5, 86, 187, 86, 19, 489]

def sort(list):
	for a in range(len(list)-1):#loop to check if the list is in ascending order
		while not list[a] <= list[a+1]:
			return list
		else:
			for r in range(len(list)-1):
				for t in range((len(list)-1)-r):
					if list[t] > list[t+1]:
						temp = list[t]
						list[t] = list[t+1]
						list[t+1] = temp

sort(list)
sort(list1)

print(list)
print(list1)

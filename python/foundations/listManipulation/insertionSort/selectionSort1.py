unsorted_list  = [63, 98, 17, 963, 25, 96, 185]

sorted_list = []

#checking the basic functions
'''
unsorted_list.remove(0)
unsorted_list.remove(2)

sorted_list.append(0)
sorted_list.append(2)
'''

def max (list):
	while len(unsorted_list) != 0:
		for t in range(len(list)-1):
			if list[t] > list[t+1]:
				temp = list[t]
				list[t] = list [t+1]
				list[t+1] = temp
		maximum = list[-1]
		#print(maximum)
		sorted_list.append(maximum)
		unsorted_list.remove(list[-1])
	


max(unsorted_list)

print(sorted_list)
		
		
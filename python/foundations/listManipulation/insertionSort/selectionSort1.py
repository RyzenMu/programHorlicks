unsorted_list  = [3, 2, 4, 5,]

sorted_list = []

#checking the basic functions
'''
unsorted_list.remove(0)
unsorted_list.remove(2)

sorted_list.append(0)
sorted_list.append(2)
'''

def sort(list):
	for s in range(len(list)):
		temp = []
		for d in range(len(list)):
			if list[s] < list[d]:
				temp.append(list[d])
		print(temp)
		print("-------------------")
		
					
				
				
				


sort(unsorted_list)
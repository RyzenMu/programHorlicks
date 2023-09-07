import math

def splitter(list):
	x = len(list)
	mid = x //2
	list1 = list[:mid]
	list2 = list[mid:]
	print(list1)
	print(list2)
	x =(x //2)
	while x > 2:
		print(x)
		mid1 = x //2
		x-=math.floor(x/2)
		list2 = list1[mid1:]
		list1 = list1[:mid1]
		print(list1)
		print(list2)
	x = len(list)
	mid = x //2
	x = x//2
	list2 = list[mid:]
	while x >2:
		print(x)
		mid1 = x //2
		x-=math.floor(x/2)
		list1 = list2[mid1:]
		list2 = list2[:mid1]
		print(list1)
		print(list2)	
	
	

list = [1,2,3,4,5,6,7,8,9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 3, 31, 32, 33, 34, 35]

splitter(list)

'''

2 = 0
4 = 1
8 = 2
16 = 3
32 = 4
'''
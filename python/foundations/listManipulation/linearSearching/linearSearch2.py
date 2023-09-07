def search(list1, key):
	list2 = []
	flag = False
	for i in range(len(list1)):
		if key == list1[i]:
			flag = True
			list2.append(i)
	if flag == True:
		print("key element is found at index: ")
		print(list2)
		for i in list2:
			print(i)
	else:
		print("Key is not found")


list1 = [34, 23, 5, 6, 7, 1, 23, 8]
print(list1)
key = int(input("enter the key element : "))
search(list1, key)
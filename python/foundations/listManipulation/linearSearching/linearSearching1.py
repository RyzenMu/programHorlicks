#linear searching 1
def linear_Search(list, number):
	store = 0
	for m in range(len(list)):
		if list[m] == number:
			print("the number found at :" , m)
			store = 1
			break
	if store == 0:
		print(" sorry the number could not be found")
		
	

arr = [ 2, 3, 0, 6 , 7, 5]

linear_Search(arr, 8)

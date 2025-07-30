#binary2.py
import math

arr = [7, 97, 26, 4, 76, 6, 83, 69, 20, 95, 53, 43, 13, 76, 23, 97, 34, 90, 95, 39, 4, 56]

searchingNumber = 69

arr.sort(reverse = True)

def binary(arr):
	low = 0
	mid = len(arr)/2
	high = len(arr)
	while(low < 22 ):
		print("----------")
		print("Rightlow is : ", math.ceil(low))
		print("Rightmid is : ", math.ceil(mid))
		print("Righthigh is : ", high)
		print("Leftlow is : ", 0))
		print("Leftmid is : ", ))
		print("Lefthigh is : ", high)
		print("----------")
		low = mid
		mid = math.ceil((high+low)/2)
		
	

binary(arr)
	

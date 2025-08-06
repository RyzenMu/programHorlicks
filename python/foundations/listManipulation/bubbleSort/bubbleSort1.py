#bubblesort1.py
def sort(nums):
	for w in range (len(nums)-1):
		for q in range (len(nums)-1):
			if nums[q] >= nums[q+1]:
				temp = nums[q]
				nums[q] = nums[q+1]
				nums[q+1] = temp



nums = [15, 66, 5, 3, 8, 6, 7, 2, 45, 27]

sort(nums)

print(nums)




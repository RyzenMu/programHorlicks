#insertion sort
list = [3, 5, 7, 6, 1, 0]

for b in range (len(list)-1):
	if list[b] > list[b+1]:
		anchor = list[b+1]	
		print(anchor)
		if anchor < list[b-1]:
			print(anchor)
			if anchor < list[b-2]:
				print(anchor)
				if anchor < list[b-3]:
					print(anchor)
					if anchor < list[b-4]:
						print(anchor)
		print(list)
			
		
for l in range (len(list)-1):
	if list[l] > list[l+1]:
		anchor = list[l+1]
		print(anchor)
		for n in range(l, 0, -1):
			if anchor < list[n]:
				print(anchor)
				temp = anchor
				temp1 = list[n]
				list[n] = anchor
				anchor = temp1	

print(list)

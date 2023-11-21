# multiplication operator
t1 = ('monday', 'tuesday')
t2 = t1 * 3
print(t2)

#concatenation operator +
t2 = t2 + ('wednesday', 'thrusday')
print(t2)

#len operator
t2_length = len(t2)
print(t2_length)

#indexing
ind = t2[-4]
print(ind)

#slicing
sli  = t2[-4 : -2]
print(sli)

#min, max, sum 
t3 = (10, 40, 20, 30)
print(min(t3))
print(max(t3))
print(sum(t3))

#membership operator
print(25 in t3)
print(20 in t3)
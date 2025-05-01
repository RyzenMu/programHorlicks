# one or more sets
# one or more sets

digits1 = {0, 1, 2, 3}
digits2 = {2, 4, 5, 6}
digits3 = {0, 7, 8, 9, 2}
union1 = set.union(digits1, digits2, digits3)
print(union1)
inter1 = set.intersection(digits1, digits2, digits3)
print(inter1)
diff1 = set.difference(digits1, digits2, digits3)
print(diff1) # subtraction first set from union of all sets

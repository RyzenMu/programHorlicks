# list does not support union, intersection operations , so we have to convert list to set
# and finally convert set to list

def union(l1, l2):
    return list(set(l1) | set(l2))

def intersection(l1, l2):
    return list(set(l1) & set(l2))

def difference(l1, l2):
    return list(set(l1) - set(l2))
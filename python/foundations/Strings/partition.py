# partition divides a string into two based on a delimiter

str = " The dog is barking, but the travellers and bikers ride it unnoticingly"

print(str.partition("and"))

partitionString = str.partition(('and'))

for partition in partitionString:
    print(partition)
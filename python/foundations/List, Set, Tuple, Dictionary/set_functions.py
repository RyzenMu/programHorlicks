# function add - adds the element to the set

vehicles = {'car', 'bike', 'bicycle'}
vehicles.add('Bus') # to add single element
print(vehicles)

#function update
vehicles.update({'truck', 'rickshaw', 'scooter'}) # update function is used to add many elements
print(vehicles)

#function remove
vehicles.remove('scooter')
print(vehicles)

# function pop - removes one element unpredictabely
remove_pop = vehicles.pop()
print(remove_pop)

# function clear - is used to delete all the elements in the set leaving empty set
vehicles.clear()
print(vehicles)

# function del deletes the empty set
del vehicles
print(vehicles)
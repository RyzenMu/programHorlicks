# string method in python

class Hotel:
    def __init__(self, name, rooms):
        self.name = name
        self.rooms = rooms

    def __str__(self):
        return "The Name of the Hotel is : " + self.name+ ".\nThe number of rooms in the Hotel is :"+str(self.rooms)

h1 = Hotel("AKGN", 66)
print(str(h1))
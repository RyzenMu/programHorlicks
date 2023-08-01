class Bed:
    def __init__(self, name, color) -> None:
        self.name = name
        self.color = color

b1 = Bed("muruga", "blamck")

print(b1.color)
print(b1.name)
del b1
print(b1.color)
print(b1.name)

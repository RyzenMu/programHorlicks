#LIFO -last in First Out

class Stack:
        def __init__(self):
                self.values = list()
        def push(self, element):
                self.values.append(element)
        def isEmpty(self):
                return len(self.values) == 0
        def pop(self):
                if not(self.isEmpty()):
                        return self.values.pop()
                else:
                        print("stack underflow")
                        return None
        def top(self):
                if not(self.isEmpty()):
                        return self.values[-1]
                else:
                        print("stack empty")
                        return None
          def size(self):
                return len(self.values)
          def __str__(self):
                stringRepr = ''
                for i in reversed(self.values):
                        stringRepr += str(i) + '\t'
                return stringRepr



s1 = Stack()
s1.push(10)
s1.push(20)
s1.push(30)
print(s1)
print(s1.size())


arr = [12, 45, 23, 67]
print(arr)
print(str(reversed(arr)))

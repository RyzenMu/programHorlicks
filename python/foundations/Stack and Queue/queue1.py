class Queue:
        def __init__(self):
                self.values = list()
        def enqueue(self, element):
                self.values.append(element)
        def dequeue(self):
                if not(self.isEmpty()):
                        return self.values.pop(0)
                else:
                        print('queue underflow')
                        return None
        def isEmpty(self):
                return len(self.values) == 0
        def front(self):
                if not(self.isEmpty()):
                        return self.values[0]
                else:
                        print('queue empty')
                        return None
        def size(self):
                return len(self.values)
        def __str__(self):
                stringRepr = ""
                for i in self.values:
                   stringRepr += str(i) + '\t'
                return stringRepr

arr = [10, 20, 30, 40, 50]
arr1 = arr
arr.pop(0)
print(arr)
print(arr1)

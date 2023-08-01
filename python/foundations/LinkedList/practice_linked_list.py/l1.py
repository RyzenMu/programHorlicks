
# initilizing Node class

class Node:
    def __init__(self, value):
        self.data = value
        self.next = None
        
class LinkedList:
    def __init__(self) :
        self.head = None

    def addBegin(self,value):
        if self.head is None:
            self.head = Node(value)





def main():
    first = Node(10)
    first.next = Node(20)
    first.next.next = Node(30)
    print("first : ", first)
    print("Second : ", first.next)
    print("Third : ", first.next.next)
    print("______________________")
    print("First Data : ", first.data)
    print("Second Data : ", first.next.data)
    print("Third data : ", first.next.next.data)
    print("___________________________")
    print(" First Link : ", first.next)
    print("Second Link : ", first.next.next)
    print("Third Link : ", first.next.next)
    print("______________________________")
    

    
if __name__ == "__main__":
    main()

    

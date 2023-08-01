from node import Node

class LinkedList:

    def __init__(self):
        self.head = None

    def insertSort(self, value):
        if self.head is None:
            self.head = Node(value)
        elif value < self.head.data:
            temp = Node(value)
            temp.next = self.head
            self.head = temp
        else:
            current = self.head
            prev = None
            while current != None:
                if current.data > value:
                    break
                prev = current
                current = current.next
            temp = Node(value)
            prev.next = temp
            temp.next = current
        print("Value inserted!!!")

    def __str__(self):
        temp = self.head
        result =''
        if temp != None:
            while temp.next != None:
                result += str(temp.data) + "->"
                temp = temp.next
            result += str(temp.data)
        else:
            result = "Empty List"
        return result


def main():
    lst =LinkedList()
    while 1:
        value = input("Enter value to be inserted: ")
        if value == "":
            break
        lst.insertSort(eval(value))
        print("Current Linked List Status")
        print(lst)
    
if __name__ == '__main__':
    main()
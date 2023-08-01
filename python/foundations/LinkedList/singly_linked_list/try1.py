# singely liked List


# creating a node which has 2 parameters 1. value of the node and 2. link to next node

class Node:
    def __init__(self, value):
        self.data = value # setting a value in data variable
        self.next = None  # link to next node

class LinkedList:
    def __init__(self):
        self.head = None

    def insertBegin(self, value):
        if self.head is None:
            self.head = Node(value)
        else:
            temp = Node(value)
            temp.next = self.head
            self.head = temp
    
    def delBegin(self):
        if self.head is None:
            print('Empty List')
            return None
        else:
            temp = self.head
            value = self.head.data
            self.head = self.head.next
            del temp
            return value


def main():
    lst = LinkedList()
    while 1:
        choice = int(input("1. Insert \n 2. Delete \n3.Quit"))
        if choice == 1:
            value = eval(input("Ebter value to be inserted :"))
            lst.insertBegin(value)
        elif choice == 2:
            value = lst.delBegin()
            print('value deleted', value)
        elif choice == 3:      
            break


if __name__ == "__main__":
    main()
# insertion and deletion at the begining of the Node
from l1 import Node

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
        print("Value inserted")

    def deleteBegin(self):
        if self.head is None: #Empty list
            print("Empty List")
            return None
        else:
            temp = self.head
            value = self.head.data
            self.head = self.head.next
            del temp
            return value
        
def main():
    listtt = LinkedList()
    while 1:
        choice = int(input('1.Insert in Begining  \n 2.Delete from begining \n3. Quit \n'))
        if choice == 1:
            value = eval(input('Enter value to be inserted: '))
            listtt.insertBegin(value)
        elif choice == 2:
            value = listtt.deleteBegin()
            print('Value deleted', value)
        elif choice == 3:
            break


if __name__ == "__main__":
    main()


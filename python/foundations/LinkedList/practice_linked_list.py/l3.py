from l1 import Node
from l2 import LinkedList

class LinkedListPlus(LinkedList):
    def deleteValue(self, value):
        if self.head is None:
            print("Empty List")
            return
        if self.head.data == value:
            temp = self.head
            self.head = self.head.next
            del temp
            print("Value Deleted")
        else:
            current = self.head
            prev = None
            while current != None and current.data != value:
                prev = current
                current = current.next
            if current != None:
                prev.next = current.next
                

        



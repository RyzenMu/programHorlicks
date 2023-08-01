from singly_linked_list import try1
import linked_list_1
import linked_list_2
import linked_list_introduc


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

#Deleting a particular node from linked List

    def delVal(self, value):
        if self.head is None:
            print('Empty List')
            return
        if self.head.data == value:
            temp = self.head
            self.head = self.head.next
            del temp
            print('Value Deleted')
        else:
            current = self.head
            prev = None
            while current != None and current.data != value:
                prev = current
                current = current.next
            if current != None:
                prev.next = current.next
                del current
                print('value', value, 'deleted')
            else:
                print("value not deleted")


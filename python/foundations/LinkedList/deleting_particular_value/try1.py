class Node:
    def __init__(self, value):
        self.data = value 
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None 

    def add(self, value):
        if self.head is None:
            self.head = Node(value)
        else:
            self.head.next = Node(value)



    def delVal(self, value):
        if self.head is None:
            print('Empty List')
            return
        if self.head.data == value:
            temp = self.head
            self.head = self.head.next
            del temp
            print('Value deleted')
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
                print('value not detected')

def main():
    choose_option = eval(input('Enter a option : '))
    value = eval(input('Enter a value'))
    linli = LinkedList()
    while 1:
        if choose_option == 1:
            linli.add(value)
        elif choose_option == 2:
            linli.delVal(value)
        elif choose_option == 3:
            break
        else:
            print('choose 1 or 2 ')

if __name__ == "__main__":
    main()
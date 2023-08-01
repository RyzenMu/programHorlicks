
# insertion and deletion at the begining of linked list


from linked_list_1 import NNode

class LinkedList:
    def __init__(self):
        '''
        objective : To initialize object of class LinkedList
        Input parameter:
            self (implicit parameter) - object of type Linked List
            Return value : None
        '''
        self.head = None

    def insertBegin(self, value):
        '''
        Objective : To insert a node at the begining of Linked List
        Input Parameters:
            self (Implicit parameter) - object of type linked list
            value - data for the node to be inserted
        Return value : None
        '''
        if self.head is None:
            self.head = NNode(value)
        else:
            temp = NNode(value)
            temp.next = self.head
            self.head = temp
        print('Value inserted !!')

    def delBegin(self):
        '''
        Objective : To delete a node from the begining of Linked List
        Input Parameter:
            self (implicit parameter) - object of type Linked List
        Return Value : Value in the deleted node
        '''
        if self.head is None: #Empty list
            print('Empty List')
            return None
        else:
            temp = self.head
            value  = self.head.data
            self.head = self.head.next
            del temp
            return value


def main():
    '''
    Objective: To carry out linked list operations based on user inputs
    Input parameter : None
    Return Value : None
    '''

    lst = LinkedList()
    while 1:
        choice = int(input('1.Insert in Begining  \n 2.Delete from begining \n3. Quit \n'))
        if choice == 1:
            value = eval(input('Enter value to be inserted: '))
            lst.insertBegin(value)
        elif choice == 2:
            value = lst.delBegin()
            print('Value deleted', value)
        elif choice == 3:
            break


if __name__ == "__main__":
    main()
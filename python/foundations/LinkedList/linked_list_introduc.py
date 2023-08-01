1

class Node:#class node
    def __init__(self, value):
        '''
        Objective : To initialize an object of class Node Input parameters:
        self (implicit parameter) - object of type Node 
        return Value : None
        '''
        self.data = value
        self.next = None


def main():
    '''
    objective: To create a linked list comprising of three nodes
    Input parameter : None
    Return Value : None
    '''

    first = Node(20)
    first.next = Node(15)
    first.next.next = Node(25)

    print('first : ', first)
    print('first data : ', first.data)
    print('first next : ', first.next)
    print("__________________________")
    print('second : ', first.next)
    print('second data : ', first.next.data)
    print('second next : ', first.next.next)
    print("__________________________")
    print('third : ', first.next.next)
    print('second data : ', first.next.next.data)
    print('second next : ', first.next.next.next)



if __name__ == '__main__':
    main()

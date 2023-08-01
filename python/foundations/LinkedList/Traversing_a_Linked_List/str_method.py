def __str__(self):
    '''
    Objective : To return string representation of an object of type LinkedList
    Input Parameter : self (implict parameter) - object of type Linked List
    Return Value: string
    '''
    current = self.head
    result =''
    if current != None:
        while current.next != None:
            result += str(current.data) + '->'
            current = current.next
        result += str(current.data)
    else:
        result = "Empty List"
    return result
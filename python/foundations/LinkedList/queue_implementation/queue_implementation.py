class Node:
    def __init__(self, value):
        self.data = value
        self.next = None

class LinkedQueue:
    def __init__(self):
        self.front = self.rear = None

    def enqueue(self, value):
        if self.front is None:
            self.front = self.rear = Node(value)
        else:
            self.rear.next = Node(value)
            self.rear = self.rear.next

    def dequeue(self):
        if self.front is None: #Empty List
            print('Queue Underflow')
            return None
        else:
            temp = self.front
            value = self.front.data
            self.front = self.front.next
            del temp
            return value
        
    def isEmpty(self):
        return self.front is None
    
    def getFront(self):
        if not(self.isEmpty()):
            return self.front.data
        else:
            print('Queue Empty')
            return None
        
    def __str__(self):
        temp = self.front
        result = ""
        if temp != None:
            while temp.next != None:
                result += str(temp.data) + "->"
                temp = temp.next
            result += str(temp.data)
        else:
            result = "Empty Queue"
        return result
    

def main():
    while 1:
        print("Choose an option \n")
        print("1: Create Queue")
        print("2: Delete Queue")
        print("3: Enqueue")
        print("4: Dequeue")
        print("5: Print Queue Data")
        print("6: Front Value")
        choice = int(input("Enter Choice : "))
        if choice == 1:
            q = LinkedQueue()
        elif choice == 2:
            del q
            print("Queue Deleted")
        elif choice == 3:
            value = int(input("Enter value to be inserted: "))
            q.enqueue(value)
            print("Node Inserted!!!")
        elif choice == 4:
            value = q.dequeue()
            print('Value dequeued: ', value)
        elif choice == 5:
            print(q)
        elif choice == 6:
            value = q.getFront()
            print("Front Value ", value)
        proceed = input("Enter y if you wish to continue: ")
        if proceed != "y" and proceed != "Y":
            break


if __name__ == "__main__":
    main()
        

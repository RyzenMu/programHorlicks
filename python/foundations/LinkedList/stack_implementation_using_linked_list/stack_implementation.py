class Node:
    def __init__(self, value):
        self.data = value
        self.next = None

class LinkedStack:

    def __init__(self):
        self.top = None

    def push(self, value):
        if self.top is None:
            self.top = Node(value)
        else:
            temp = Node(value)
            temp.next = self.top
            self.top = temp

    def pop(self):
        if self.top is None: # Empty List
            print("Stack Underflow")
            return None
        else:
            temp = self.top
            value = self.top.data
            self.top = self.top.next
            del temp
            return value
        
    def isEmpty(self):
        return self.top is None
    
    def getTop(self):
        if not(self.isEmpty()):
            return self.top.data
        else:
            print("stack empty")
            return None
    
    def __str__(self):
        temp = self.top
        result = ""
        if temp != None:
            while temp.next != None:
                result += str(temp.data) + "->"
                temp = temp.next
            result += str(temp.data)
        else:
            result = "empty stack"
        return result
    

def main():
    while 1:
        print("1: create Stack")
        print("2: Delete Stack")
        print("3: push")
        print("4: Pop")
        print("5: Print Stack Data")
        print("6: Top Element")
        choice = int(input("Enter choice : "))
        if choice == 1:
            stk = LinkedStack()
            print("Stack Created")
        elif choice == 2:
            del stk
            print("Stack deleted")
        elif choice == 3:
            element = int(input("Enter integer value to be pushed "))
            stk.push(element)
            print("Value Added")
        elif choice == 4:
            value = stk.pop()
            print("Element popped : ", value)
        elif choice == 5:
            print(str(stk))
        elif choice == 6:
            value = stk.getTop()
            print("Top Element ", value)
        proceed = input("Enter y if you wish to continue")
        if proceed != 'y' and proceed != "Y":
            break

        
if __name__ == "__main__":
    main()

        
    
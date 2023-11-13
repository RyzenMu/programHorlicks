from bNode import Node
class binSearchTree:
    def __init__(self):
        self.root = None

    def insertVal(self, value):
        if self.root == None:
            self.root = Node(value)
        else:
            child = self.root #Although root has no parent, we call it child
            parent = None
            while child != None:
                parent = child
                if value <= child.data:
                    child = child.left
                else:
                    child = child.right
                if value <= parent.data:
                    parent.left = Node(value)
                else:
                    parent.right = Node(value)
        print("value inserted")

    def insertVal_recursive(self, value):
        def insertVal_R(root, value):
            if root == None:
                root = Node(value)
            elif value <= root.data:
                root.left = insertVal_R(root.left, value)
            else:
                root.right = insertVal_R(root.right, value)
        self.root = insertVal_R(self.root, value)

    def inorderTraversal(self):
        def inorder(root):
            if root != None:
                inorder(root.left)
                print(root.data, end= " ")
                inorder(root.right)
        inorder(self.root)

    def preorderTraversal(self):
        def preorder(root):
            if root != None:
                print(root.data, end=' ')
                preorder(root.left)
                preorder(root.right)
        preorder(self.root)

    def postorderTraversal(self):
        def postorder(root):
            if root != None:
                postorder(root.left)
                postorder(root.right)
                print(root.data, end= " ")
        postorder(self.root)

    def treeHeight(self):
        def height(root):
            if root == None or (root.left == None and root.right == None):
                return 0
            else:
                return max(height(root.left), height(root.right)) + 1
            
def main():
    bst = binSearchTree()
    while 1:
        choice = int(input('\n1: insert a value \n2: inorder traversal \n3: preorder traversal \n4: postorder traversal \n5: height of tree \n6: quit'))
        if choice == 1:
            value = eval(input('enter value to be inserted'))
            bst.insertVal(value)
        elif choice == 2:
            bst.inorderTraversal()
        elif choice == 3:
            bst.preorderTraversal()
        elif choice == 4:
            bst.postorderTraversal()
        elif choice == 5:
            print('The tree height is : ', bst.treeHeight())
        elif choice == 6:
            break

if __name__ == '__main__':
    main()
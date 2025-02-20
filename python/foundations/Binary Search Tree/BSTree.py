# binary search tree

from bNode import Node

def main():
    bst = Node(15)
    bst.right = Node(23)
    bst.right.right = Node(30)
    bst.right.left = Node(20)
    bst.left = Node(10)
    bst.left.left = Node(6)
    inorder(bst)
    print()
    preorder(bst)
    print()
    postorder(bst)
    print()
    print(height(bst))

def inorder(root):
    if root != None:
        inorder(root.left)
        print(root.data, end=" ")
        inorder(root.right)

def preorder(root):
    if root != None:
        print(root.data, end= " ")
        preorder(root.left)
        preorder(root.right)

def postorder(root):
    if root != None:
        postorder(root.left)
        postorder(root.right)
        print(root.data, end=" ")

def height(root):
    if root == None or (root.left == None and root.right == None):
        return 0
    else:
        return 1 + max(height(root.left), height(root.right))
        
if __name__ == "__main__":
    main()
    

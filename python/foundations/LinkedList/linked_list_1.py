
# example of creating nodes in python

class NNode:

    def __init__(self, value):
        self.data = value
        self.next = None


def main():
    nnode1 = NNode(12)
    nnode1.next = NNode(24)
    nnode1.next.next = NNode(36)
    nnode1.next.next.next = NNode(48)
    nnode1.next.next.next.next = NNode(48)

    print(nnode1.next.next.next.data)
    print(nnode1.next.next.next.next)


if __name__ == '__main__':
    main()
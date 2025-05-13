#hanoi tower
#hanoi tower
def hanoi(n, source, spare, target):
    if n == 1:
        print('Move a dist from', source, 'to', target)
    elif n == 0:
        return
    else:
        hanoi(n-1, source, target, spare)
        print('move a disk from ', source, 'to', target)
        hanoi(n-1, spare, source, target)

def main():
    n = int(input('enter the number of discs: '))
    source = int(input('enter source pole : '))
    spare = int(input('enter spare pole : '))
    target = int(input('enter target pole : '))
    hanoi(n, source, spare, target)

if __name__ == '__main__':
    main()

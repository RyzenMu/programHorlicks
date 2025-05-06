#factorial iterative approach
def factorial(n):
    fact = 1
    assert n >= 0
    for i in range(1, n+1):
        fact = fact * i
    return fact


def main():
    n = int(input('Enter the Number '))
    fact = factorial(n)
    print('Factorial of :', n, "is ", fact)


if __name__ == '__main__':
    main()

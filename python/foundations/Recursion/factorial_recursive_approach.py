def factorial(n):
    assert n >= 0
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n-1)

def main():
    n = int(input('Enter the Number '))
    fact = factorial(n)
    print('Factorial of :', n, "is ", fact)


if __name__ == '__main__':
    main()
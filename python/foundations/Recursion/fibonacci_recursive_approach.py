def fibo(n):
    assert n > 0
    if n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        return fibo(n-1) + fibo(n-2)
    
def main():
    n = int(input('Enter the Number '))
    fib = fibo(n)
    print('Fibonacci of :', n, "is ", fib)


if __name__ == '__main__':
    main()
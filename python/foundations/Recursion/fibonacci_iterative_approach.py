def fibonacci(n):
    assert n > 0
    secondLast = 0
    last = 1
    if n == 1:
        return secondLast
    elif n == 2:
        return last
    for i in range(3, n+1):
        result = secondLast + last
        secondLast = last
        last = result
    return result

def main():
    n = int(input('Enter the Number '))
    fibo = fibonacci(n)
    print('Fibonacci of :', n, "is ", fibo)


if __name__ == '__main__':
    main()
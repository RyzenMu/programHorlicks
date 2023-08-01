def max3(n1, n2, n3):
    '''
    Objective : To find maximum of three  numbers
    input parameters : n1, n2, n3 - numeric values
    return value: maxNumber - numeric value
    '''

    maxNumber = 0

    if n1 > n2:
        if n1 > n3:
            maxNumber = n1
    elif n2 > n3:
        maxNumber = n2
    else:
        maxNumber = n3
    return maxNumber


def main():
    '''
    Objective: to find maximum of three numbers
    Input parameter : None
    Return Value : None
    '''

    n1 = int(input('Enter first number: '))
    n2 = int(input('Enter Second number: '))
    n3 = int(input('Enter Third number: '))

    maximum = max(n1, n2, n3)
    print('Maximum number is :', maximum)


if __name__ == '__main__':
    main()

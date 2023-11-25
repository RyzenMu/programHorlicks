def length(str1):
    if str1 == '':
        return 0
    else:
        return 1 + length(str1[1:])
    
def main():
    str1 = input('Enter the string')
    result = length(str1)
    print('Length of string ', str1, 'is', result)

if __name__ == '__main__':
    main()
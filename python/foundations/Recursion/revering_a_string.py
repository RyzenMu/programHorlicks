def reverse(str1):
    if str1 == '':
        return str1
    else:
        return str1[-1] + reverse(str1[:-1])
    
def main():
    str1 = input('Enter the string : ')
    result = reverse(str1)
    print('reverse of string', str1, "is ", result)

if __name__ == "__main__":
    main()
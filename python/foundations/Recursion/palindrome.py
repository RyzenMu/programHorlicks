#palindrome
def isPalindrome(str1):
    if str1 == '':
        return True
    else:
        return(str1[0] == str1[-1] and isPalindrome(str1[1 : -1]))
    
def main():
    str1 = input('Enter the string :')
    if (isPalindrome(str1)):
        print('string is a palindrome')
    else:
        print('string is not a palindrome')

if __name__ == "__main__":
    main()

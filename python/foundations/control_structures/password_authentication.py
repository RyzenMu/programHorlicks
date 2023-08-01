

def authenticateUser(password):
    if password == 'magic':
        message = " Login Successful !! \n Welcome to system."
    if password != 'magic':
        message = " Password Mismatch !!"
    return message


def main():
    print(" \t LOGIN SYSTEM")
    print("----------------------")
    password = input('Enter Password ')
    message = authenticateUser(password)
    print(message)

if __name__ == "__main__":
    main()
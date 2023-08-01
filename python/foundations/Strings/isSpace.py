# The functions isspace, isaplpha, isdigit, and isalnum enable us to check wheather a value is of desire type.abs(
# )

name = input("Enter your name : ")

print(name.isalpha())

phno = input("Enter your mobile number : ")

print(phno.isdigit())

# python function isspace is to check a string is a complete whitespace

str = '    \n \t'
print(str.isspace())

# isalnum - is alpha numeric

str = 'jfhd874kjhf'
print(str.isalnum())
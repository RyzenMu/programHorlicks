# findall

import re

pythoncode = '''

"""
Python code to add two numbers

"""

a= 5 #number1
b = 6 #number2
#compute addition of two numbers
c= a+b


'''

match = re.findall(r'#.*', pythoncode)
print(match)

#multi-line comment
match = re.findall(r'""".*?"""', pythoncode, re.DOTALL)
print(match)
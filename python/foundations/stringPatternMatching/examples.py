# the function group of match object instance returns the substring that matches the regular expression.
import re

string1 = "Welcome to python shell"
match =  re.search('pytho', string1)
print(match.group())
# try
#     match = re.search("Pyth", string1)
#     print(match.group())
# except TypeError:
#     print("exception occured")
# finally:
#     print('completed')


# * 
string2 = "python shell"
match = re.search("shel*", string2)
print(match.group())

# ?
string3 = 'Python Shell'
match = re.search('(S|s)hel?', string3)
print(match.group())

# {1, 2}
string4 = 'Python Shelllll'
match = re.search('(S|s)hel{1,2}', string4)
print(match.group())

# {1, 3}
string5 = 'Python Shellllll'
match = re.search('(S|s)hel{1,3}', string4)
print(match.group())

# {1, 4}
string5 = 'Python Shellllll'
match = re.search('(S|s)hel{1,4}', string4)
print(match.group())

# .......
string6 = 'Python Shell'
if re.search('.....', string6):
    print('String length greater than or equal to 5')

#^Python
string7 = "Python is a powerful language"
if re.search('^(P|p)ython', string6):
    print('String starts with Python')

# ^power
string8 = 'Python is a powerful language'
if re.search('^power', string8):
    print('String starts with power')
else:
    print('String does not starts with power')

# powerful$
string9 = 'Python is a powerful language'
if re.search('powerful$', string9):
    print('String ends with powerful')
else:
    print('String does not ends with powerful')

# language$
string10 = 'Python is a powerful language'
if re.search('age$', string10):
    print('String ends with language')
else:
    print('String does not ends with language')

# \d\d\d\d\d
string11 = 'Roll no is 23456'
match = re.search('\d\d\d\d\d', string11)
print(match.group())

# \d{5}
string12 = 'Roll no is 23456'
match = re.search('\d{5}', string12)
print(match.group())

# [0-9]+ \.[0-9]+
string13 = "Decrease in price is -45.89"
match = re.search('-[0-9]+\.[0-9]+', string13)
print(match.group())

#w*
string14 = "python Shell"
match = re.search('\w*', string14)
print(match.group())

#\w*\s\w*
string15 = "we used python shell"
match = re.search('\w*\s\w*', string15)
print(match.group())

# .*
string16 = 'I use **python** do you'
match = re.search('.*', string16)
print(match.group())

# (a(b|c))*
string17 = 'abac12ccaab'
match = re.search('(a(b|c))*', string17)
print(match.group())

# (a(b|c))*\d{1, 2}c*
string18 = "abac12ccaab"
match = re.search('(a(b|c))*\d{1,2}c*', string18)
print(match.group())

#\w*\d\d.*b$
string19 = 'abac12ccaab'
match = re.search('\w*\d\d.*b$', string19)
print(match.group())

#(a(b|c))*
string20 = 'abac12ccaab'
match = re.search('(a(b|c))*', string20)
print(match.group())

#(a(b|c))+
string21 = 'abac12ccaab'
match = re.search('(a(b|c))+', string21)
print(match.group())









import re

# email pattern finder

# generally a regular expression is preceeded with r to denote a raw string.

# use of a raw string as a regular expression avoids any confusion with some characters

string = 'ram@gmail.com, pranav.gupta@cs.iitd.ac.in, nik@yahoo.com, raman@gmail.com'

match = re.search(r'[a-z0-9]+(\.[a-z0-9]+)*@[a-z]+(\.[a-z]+)+', string)

print(match.group())


# re.finditer()

for i in re.finditer(r'[a-z0-9]+(\.[a-z0-9]+)*@[a-z]+(\.[a-z]+)+', string):
    print(i.group())


# re.finditer()

string = 'Walking down the road, he was thinking about the coming years.'

for i in re.finditer(r'[A-Za-z]+ing', string):
    print(i.group())


#findall
string = 'Walking down the road, he was thinking about the coming years.'
for i in re.findall(r'[A-Za-z]+ing', string):
    print(i)

# we can use findall to count number of words in a string
string = 'Python: Python is an interactive language. it is developed by Guido Van Rossum'
match = re.findall('\w+', string)
print(match)
print(len(match))


# strip removes the whitespace before and after a string
# lstrip removes the whitespace before the string
# rstrip removes the whi9tespace after the string

str = "    jhjsdfhkjds   kahfhajhf   kjhdfjkdsh   "
print(str)
print(str.strip())

str = "    hjgjhgjhg    "
print(str.lstrip())
print((str.rstrip()))

#striping a character
str = " ayellowlighta "
print(str.strip('a'))
str = "ayellowlighta"
print(str.strip('a'))
print(str.lstrip('a'))
print((str.rstrip('a')))
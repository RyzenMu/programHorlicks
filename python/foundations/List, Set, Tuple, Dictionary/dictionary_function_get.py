'''
the function get is used to extract the value corresponding to a given example
dictionary function
'''

passwords = {
    'Ram' : 'aka606',
    'Shyam' : 'rou.589',
    'Gita' : 'yam@694'
}

result = passwords.get('Ram', -1)

print(result)

# the second parameter is the return value if key is not present
# in case if -1 is not specified it will return None

# to create a shallow copy , we use copy method
# to create a shallow copy, we use copy method

passwords = {
    'Ram' : 'aka606',
    'Shyam' : 'rou.589',
    'Gita' : 'yam@694'
}

new_passwords = passwords.copy()

print(id(passwords))
print(id(new_passwords))

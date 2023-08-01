# encode

# sometimes we need to transform data from one format to another for the sake of compatibility

str = 'message'

print(str.encode('utf32'))

encodedStr = str.encode('utf32')

print(encodedStr.decode('utf32'))
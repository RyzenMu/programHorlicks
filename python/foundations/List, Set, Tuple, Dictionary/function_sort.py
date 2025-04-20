nemes = ['ramesh', 'suba', 'sanjeevini', 'padmavathee', 'minupriya', ]
# sort function arranges the list in ascending order
# sort function arranges the list in ascending order
nemes.sort()
print(nemes)
# sort function with reverse = True, arranges the list in descending order
nemes.sort(reverse=True)
print(nemes)
# passing key value inside 
nemes.sort(key=len) # len as a key
print(nemes)


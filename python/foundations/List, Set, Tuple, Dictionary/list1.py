#list1.py
subjects = ["hindi", "english", "maths", "History", 323, True, False, 3244]
temporary = subjects # the method of accessing objects bydifferent names is called aliasing

print(id(subjects))
print(id(temporary))
print(temporary)

subjects[4] = "science"
temporary[5] = "environment"
print(temporary)

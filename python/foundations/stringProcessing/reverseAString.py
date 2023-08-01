def reverse(str):
    result = ""
    for e in range(len(str)):
        result += str[(len(str)-1)-e]
    return result




print(reverse("reversing a string"))
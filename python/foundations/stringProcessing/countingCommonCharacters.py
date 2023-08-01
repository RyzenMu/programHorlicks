# counting the number of common characters in a pair of strings

def nCommonChars(str1, str2):
    temp1 = str1.lower()
    temp2 = str2.lower()
    count = 0
    for i in range((len(temp1))):
        ch1 = temp1[i]
        if not (ch1 in temp1[:i]):
            for ch2 in temp2:
                if ch1 == ch2:
                    count += 1
                    break
    return count

name1 = "Ram Rahim"
name2 = " SAMARTH RAHI"
print(nCommonChars(name1, name2))
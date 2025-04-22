# inverted dictionary

def build_Inv_Dictionary(dict1):
    inv_dict = {}
    for key, value in dict1.items():
        if value in inv_dict:
            inv_dict[value].append(key)
        else :
            inv_dict[value] = [key]
    inv_dict = {x:inv_dict[x] for x in inv_dict if len(inv_dict[x]) > 1}
    return inv_dict

def main():
    wordmeaning = eval(input('Enter word meaning dictionarry : ' ))
    meanindWord = build_Inv_Dictionary(wordmeaning)
    print('Inverted Dictionary : \n', meanindWord)

if __name__ == "__main__":
    main()

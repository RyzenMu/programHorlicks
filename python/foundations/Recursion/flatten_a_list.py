def flatten(lst1, lst2 = []):
    for element in lst1:
        if type(element) != list:
            lst2.append(element)
        else:
            flatten(element, lst2)
    return lst2

def main():
    lst1 = eval(input('enter the list :'))
    result = flatten(lst1)
    print('flattened list :', result)

if __name__ == '__main__':
    main()
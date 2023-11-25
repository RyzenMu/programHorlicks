def deep_copy(lst1, lst2=[]):
    if lst1 == []:
        pass
    else:
        if type(lst1[0]) != list:
            lst2.append(lst1[0])
        else:
            lst2.append([])
            deep_copy(lst1[0], lst2[-1])
        deep_copy(lst1[1:], lst2)
    return lst2

def main():
    lst1 = eval(input('Enter the list : '))
    lst2 = deep_copy(lst1)
    print('deep copy of list1 is : ', lst2)

if __name__ == '__main__':
    main()
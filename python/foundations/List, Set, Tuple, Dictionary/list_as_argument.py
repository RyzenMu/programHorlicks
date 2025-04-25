# list as arguments

def list_update(a, i, value):
    a[i] = value

def main():
    lst = [10, 20, 30, [40, 50]]
    list_update(lst, 1, 15)
    print(lst)

if __name__ == "__main__":
    main()

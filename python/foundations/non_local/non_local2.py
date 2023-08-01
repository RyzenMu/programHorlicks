#non- local variable

def main1():
    x= 10
    y=20
    def main2():
        nonlocal x
        x = 15
        y=25
        print(x)
        print(y)

    main2()
    print(x)
    print(y)


main1()
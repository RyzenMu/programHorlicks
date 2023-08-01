# nonlocal in python

def main1():
    x = 4
    def main2():
        nonlocal x
        print(x)
    main2()

main1()

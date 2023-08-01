def main():
    n = int(input('Enter the total subjects : '))
    
    total = 0
    for i in range(1, n+1):
        mark = int(input((f"enter the {i} mark : ")))
        total += mark
    print('the average mark is ', total/n)


if __name__ == '__main__':
    main()
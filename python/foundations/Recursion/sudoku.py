rows, columns = 9, 9
def find(lst, searchEle):
    (i, j) = (-1, -1)
    for row in range(0, rows):
        for col in range(0, columns):
            if lst[row][col] == searchEle:
                (i, j) = (row, col)
                return (i, j)
            
def printSol(lst):
    print('\n Solution : ')
    for row in lst:
        print(row)

def sudokoSolver(lst):
    (i, j) = find(lst, 0)
    if (i, j) == (-1, -1):
        printSol(lst)
        return
    excludedNums = set()
    for row in range(0, rows):
        for col in range(0, columns):
            if lst[row][col] != 0:
                if i ==row or j == col or (i//3 == row//3 and j//3 ==col//3):
                    excludedNums.add(lst[row][col])
    possibleNums = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    for number in possibleNums:
        if number not in excludedNums:
            lst[i][j] = number
            sudokoSolver(lst)
            lst[i][j] = 0

def main():
    lst = eval(input('Enter the list (0 for missing values : )'))
    sudokoSolver(lst)

if __name__ == "__main__":
    main()



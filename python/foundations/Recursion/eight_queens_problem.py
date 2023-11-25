class Queens:
    def __init__(self, size):
        self.boardsize = size
        self.count = 0 # count of queens
        self.board = [[False for i in range(self.boardsize)] for j in range(self.boardsize)]

    def getBoards(self):
        return self.boardsize
    
    def __str__(self) -> str:
        result = ''
        for i in self.board:
            for j in i:
                if j == False:
                    result += '-'+" "
                else:
                    result += "Q"+ " "
            result += '\n'
        return result
    
    def unguarded(self, col):
        ok  = True
        i = 0
        while (ok and i < self.count): # check upper part of cxolumn
            ok = not(self.board[i][col])
            i += 1
        i = 1 # check upper left diagonal
        while (ok and self.count-i >= 0 and col-i >= 0):
            ok = not(self.board[self.count-i][col-i])
            i += 1
        i = 1 # check upper right diagonal
        while(ok and self.count-i>=0 and col+i < self.boardsize):
            ok = not(self.board[self.count-i][col+i])
            i += 1
        return ok
    
    def add(self, col):
        self.board [self.count][col] = True
        self.count += 1

    def remove(self, col):
        self.board[self.count-1][col] = False
        self.count -= 1

    def isSolved(self):
        if self.count == self.boardsize:
            return True
        else:
            return False
        

solNum = 0
def solveFrom(configuration):
    global solNum
    if (configuration.isSolved()):
        solNum += 1
        print('solution No. ', solNum)
        print(configuration)
    else:
        for col in range(0,configuration.getBoardsize()):
            if configuration.unguarded(col):
                configuration.add(col)
                solveFrom(configuration) # recursively add queens
                configuration.remove(col)

def nQueens():
    boardSize = int(input("Enter board size : "))
    print(boardSize, " - Queens problem")
    print("The board haaaas ", boardSize, "rows and ", boardSize, "columns")
    configuration = Queens(boardSize)
    solveFrom(configuration)

def main():
    nQueens()

if __name__ == "__main__":
    main()
        

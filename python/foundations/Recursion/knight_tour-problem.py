class Knight:
    def __init__(self, size):
        self.boardsize = size
        self.moveNum = 0 # specifies the number of moves taken by the knight
        self.solNum = 0 # toatal number of knights tour ex[lored
        self.board = [[0 for i in range(size)] for j in range(size)]
        self.moves = [(2, 1), (1, 2), (-1, 2), (-2, 1), (-2, -1), (-1, -2), (1, -2), (2, -1)]

    def getBoardSize(self):
        return self.boardsize
    
    def __str__(self) -> str:
        result = ""
        for i in range(self.boardsize):
            for j in range(self.boardsize):
                result += str(self.board[i][j]) + '\t'
            result += '\n'
        return result
    
    def possible(self, xyPos):
        x, y = xyPos[0], xyPos[1]
        if x >=0 and x < self.boardsize and y>=0 and y < self.boardsize and self.board[x][y] == 0:
            return True
        else:
            return False
        
    def add(self, xyPos):
        x, y = xyPos[0], xyPos[1]
        self.moveNum += 1
        self.board[x][y] = self.moveNum

    def remove(self, xyPos):
        x, y = xyPos[0], xyPos[1]
        self.board[x][y] = 0
        self.moveNum -= 1

    def moveFurther(self, xyPos):
        x, y = xyPos[0], xyPos[1]
        if (self.isSolved()):
            self.solNum += 1
            print('Solution Number : ', self.solNum)
            print(self)
            return
        for (dx, dy) in self.moves:
            newMove = (x+dx, y+dy)
            if self.possible(newMove):
                self.add(newMove)
                self.moveFurther(newMove)
                self.remove(newMove)

    def isSolved(self):
        if self.moveNum == self.boardsize * self.boardsize:
            return True
        else:
            return False


def solveFrom(configuration):
    for i in range(configuration.getBoardSize()):
        for j in range(configuration.getBoardSize()):
            configuration.add((i, j))
            configuration.moveFurther((i, j))
            configuration.remove((i, j))

def KnightTour():
    boardSize = int(input('Enter board size :'))
    print('The board has ', boardSize, "rows and ", boardSize, "columns")
    configuration = Knight(boardSize)
    solveFrom(configuration)

def main():
    KnightTour()

if __name__ == "__main__":
    main()
    
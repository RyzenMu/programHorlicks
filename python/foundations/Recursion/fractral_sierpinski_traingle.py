#fractal sierpinski triangle 
from turtle import *
def createTriangle(points, color):
    fillcolor(color)
    penup()
    goto(points[0][0], points[0][1])
    pendown()
    begin_fill()
    goto(points[1][0], points[1][1])
    goto(points[2][0], points[2][1])
    goto(points[0][0], points[0][1])
    end_fill()

def mid(p1, p2):
    return((p1[0]+p2[0])/2, (p1[1]+p2[1])/2)

def sierpinski(points, level):
    colormap = ['blue', 'red', 'green', 'white', 'yellow', 'violet', 'orange']
    createTriangle(points, colormap[level % len(colormap)])
    if level > 0 :
        sierpinski([points[0], mid(points[0], points[1]), mid(points[0], points[2])], level-1)
        sierpinski([points[1], mid(points[0], points[1]), mid(points[1], points[2])], level-1)
        sierpinski([points[2], mid(points[2], points[1]), mid(points[0], points[2])], level-1)

def main():
    endPoints = [(-100, -50), (0, 100), (100, -50)]
    level = int(input('Enter the level for Sierpinski Triangle : '))
    sierpinski(endPoints, level)
    done()

if __name__ == "__main__":
    main()

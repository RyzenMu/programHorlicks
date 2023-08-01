import matplotlib.pyplot as plt
import matplotlib.patches as patches

def plotArrow(pos, dx, dy):
    x, y = pos[0], pos[1]
    arrow = patches.Arrow(x, y, dx, dy, fill = False, hatch = 'O')
    plt.gca().add_patch(arrow)
    plt.axis('scaled')
    plt.title('Arrow')
    plt.show()


def main():
    pos = eval(input('Enter the starting position (x, y) : '))
    dx = float(input("enter the dx : "))
    dy = float(input("enter the dy : "))
    plotArrow(pos, dx, dy)

if __name__ == "__main__":
    main()
from matplotlib import pyplot as plt
import matplotlib.patches as patches

def plotRectangle(length, breadth):
    rect = patches.Rectangle((0,0), length, breadth)
    plt.gca().add_patch(rect)
    plt.axis('scaled')
    plt.title("rectangle")
    plt.show()


def main():
    length = float(input("Enter the length : "))
    breadth = float(input("enter the breadth : "))
    plotRectangle(length, breadth)


if __name__ == "__main__":
    main()
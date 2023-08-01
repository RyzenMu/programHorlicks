'''
creating a circle requires a tuple (x, y)

'''

import matplotlib.pyplot as plt
import matplotlib.patches as patches

def plotCircle(radius):
    circle = patches.Circle((0, 0), radius, facecolor='green', edgecolor="red", linestyle='dotted', linewidth=2.2)
    plt.gca().add_patch(circle)
    plt.axis('scaled')
    plt.title('Circle')
    plt.show()

def main():
    radius = float(input('Enter the radoius : '))
    plotCircle(radius)

if __name__ == "__main__":
    main()
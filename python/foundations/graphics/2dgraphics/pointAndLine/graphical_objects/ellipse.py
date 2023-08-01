import matplotlib.pyplot as plt
import matplotlib.patches as patches

def plotEllipse(width, height):
    ellipse = patches.Ellipse((0,0), width, height, angle = 15, fc = 'cyan', ec = 'red', linestyle = 'dashed', lw = 2.2)
    plt.gca().add_patch(ellipse)
    plt.axis('scaled')
    plt.title('Ellipse')
    plt.show()

def main():
    width = float(input('Enter the width : '))
    height = float(input('Enter the height : '))
    plotEllipse(width, height)

if __name__ == "__main__":
    main()
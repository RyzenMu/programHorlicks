import matplotlib.pyplot as plt
import matplotlib.patches as patches

def plotPolygon(points):
    poly = patches.Polygon(points, ec = 'red', linestyle = 'dashdot', lw = 4)
    plt.gca().add_patch(poly)
    plt.axis('scaled')
    plt.title('polygon')
    plt.show()

def main():
    points = eval(input("enter the points : "))
    plotPolygon(points)

if __name__ == "__main__":
    main()
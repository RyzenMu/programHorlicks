# subplots for x2, x3, x4...


from matplotlib import pyplot as plt

def plotFunctions(x):

    y1 = [i**1 for i in range(x)]
    y2 = [i**2 for i in range(x)]
    y3 = [i**3 for i in range(x)]
    y4 = [i**4 for i in range(x)]
    y5 = [i**5 for i in range(x)]
    y6 = [i**6 for i in range(x)]

    x = [1, 2, 3, 4]
    
    plt.subplot(2, 3, 1) #(no.of. rows, no.of.columns, figureNumber)
    plt.plot(x, y1, "ro-")
    plt.xlabel("X")
    plt.ylabel("X")
    plt.grid()

    plt.subplot(2, 3, 2)
    plt.plot(x, y2, 'b<--')
    plt.xlabel('X')
    plt.ylabel('X**2')
    plt.grid()

    plt.subplot(2, 3, 3)
    plt.plot(x, y3, 'g*-.')
    plt.xlabel("X")
    plt.ylabel("X**3")
    plt.grid()

    plt.subplot(2, 3, 4)
    plt.plot(x, y4, "kx:")
    plt.plot("X")
    plt.plot("X**4")
    plt.grid()

    plt.subplot(2, 3, 5)
    plt.plot(x, y5, "mv--")
    plt.xlabel("X")
    plt.ylabel("X**5")
    plt.grid()

    plt.subplot(2, 3, 6)
    plt.plot(x, y6, "cp-.")
    plt.xlabel("X")
    plt.ylabel("X**6")
    plt.grid()

    plt.tight_layout()
    plt.show()

def main():
    x = eval(input("Enter list x to be plotted : "))
    plotFunctions(x)

if __name__ == "__main__":
    main()
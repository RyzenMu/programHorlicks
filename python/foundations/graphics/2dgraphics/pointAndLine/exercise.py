import matplotlib.pyplot as plt

def plotFunctions(a, b, step):
    nSteps = int((b-a)/step)
    x = [a + step*i for i in range(nSteps+1)]
    y1 = [t**2 for t in x]
    y2 = [t**3 for t in x]
    plt.plot(x, y1, 'ro--', label = 'x vx x**2')
    plt.plot(x, y2, 'b<-.', label = 'x vs x**3')
    plt.legend()
    plt.xlabel('X')
    plt.ylabel('Y')
    plt.title('X vs X**2 AND X VS X**3')
    plt.grid()
    plt.show()


def main():
    a = float(input('Enter first element '))
    b = float(input('enter last element'))
    step = float(a, b, step)
    plotFunctions(a, b, step)

if __name__ == "__main__":
    main()
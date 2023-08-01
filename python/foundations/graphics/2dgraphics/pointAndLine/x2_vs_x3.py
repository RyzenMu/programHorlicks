import matplotlib.pyplot as plt

def plotFunctions(a, b, step):
    nSteps = int((b-a)/step)
    x = [a + step * i for i in range(nSteps+1)]
    y1 = [t**2 for t in x]
    y2 = [t**3 for t in x]
    plt.plot(x, y1, 'ro--', label = 'x vs x**2')
    plt.plot(x, y2, 'b<-.', label = 'x vs x**3')
    plt.legend()
    plt.xlabel('X')
    plt.ylabel('Y')
    plt.title('X vs X**2 and X vs X**3')
    plt.grid()
    plt.show()

def main():
    a = float(input("Enter the first element of the range : "))
    b = float(input("ENter the second element of the range : "))
    step = float(input("ENter step size : "))
    plotFunctions(a, b, step)

if __name__ == "__main__":
    main()
from matplotlib import pyplot as plt

def plotHistogram(data):
    plt.hist(data, bins=[i-0.5 for i in range(0, max(data)+2)])
    plt.xlabel('Value')
    plt.ylabel('Frequency')
    plt.title('Histogram')
    #for setting limits of x-axis
    plt.xlim(min(data)-1, max(data)+1)
    plt.show()
    plt.savefig('Histogram 1')

def main():
    data = eval(input('Enter data to be plotted as histogram : '))
    plotHistogram(data)

if __name__ == "__main__":
    main()
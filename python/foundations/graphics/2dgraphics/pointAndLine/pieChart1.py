#circle is divided into sectors called wedges

import matplotlib.pyplot as plt

def plotPieChart(data, labels):
    plt.pie(data, labels= labels, autopct='%.2f')
    plt.title('pie chart')
    plt.show()

def main():
    data = eval(input('Enter data to be plotted \ as pie chart : '))
    labels = eval(input('Enter the labels : '))
    plotPieChart(data, labels)

if __name__ == "__main__":
    main()
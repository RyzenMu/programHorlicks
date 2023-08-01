from matplotlib import pyplot as plt

x = [2, 4, 5, 1, 5]

y = [7, 1, 9, 2, 8]

plt.plot(x, y, 'r*:', markerfacecolor = 'c',
          markersize = 10.8, markeredgecolor = 'b', markeredgewidth = 23,
          linestyle = '-', linewidth = 2.2)

plt.show()
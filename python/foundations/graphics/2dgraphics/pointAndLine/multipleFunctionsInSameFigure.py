from matplotlib import pyplot as plt

x = [1, 2, 3, 4, 5]

y = [9, 6, 3, 1, 4]

x1 = [4, 5, 2, 7, 3]

y1 = [3, 5, 8, 3, 8]

plt.plot(x, y, 'r*:')

plt.plot(x1, y1, 'b*:')

plt.show()
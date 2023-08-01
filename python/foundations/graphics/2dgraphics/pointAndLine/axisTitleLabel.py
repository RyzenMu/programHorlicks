from matplotlib import pyplot as plt


x = [4, 0, 3, 9, 2]

y = [6, 5, 2, 0, 5]

plt.plot(x, y, 'c*:')

#axis  axis([x-min, x-max, y-min, y-max])
plt.axis([0, 20, 0, 20])

#x-label
plt.xlabel('xxxxx')

#y-label
plt.ylabel('yyyyyy')

#grid
plt.grid()

plt.show()
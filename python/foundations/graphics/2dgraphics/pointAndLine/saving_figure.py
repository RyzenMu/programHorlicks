from matplotlib import pyplot as plt

x = range(0, 5)
y = [i**2 for i in x]

plt.plot(x, y, label="X vs X**2")
plt.savefig('XSquare')
plt.show()
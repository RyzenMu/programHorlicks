#pattern with recursion
import matplotlib.pyplot as plt

def square(x, y):
    if (x[1]-x[0] >= 1):
        plt.plot(x, y, 'ro--')
        x = [x[0]+1, x[1]-1, x[2]-1, x[3]+1, x[0]+1]
        y = [y[0]+1, y[1]+1, y[2]-1, y[3]-1, y[0]+1]
        square(x, y)

def square_wrapper_size(size):
    x = [0, size, size, 0, 0]
    y = [0, 0, size, size, 0]
    square(x, y)
    plt.title('square')
    plt.axis([min(x)-1, max(x)+1, min(y)-1, max(y)+1])
    plt.grid()
    plt.show()

def main():
    size = int(input('Enter size of outer square: '))
    square_wrapper_size(size)

if __name__ == '__main__':
    main()

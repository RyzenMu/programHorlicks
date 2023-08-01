import matplotlib.pyplot as plt

import math

def sineCurve():
    plt.subplot(2,1,1)
    degrees = range(0, 360 + 1)
    sineValues = [math.sin(math.radians(i)) for i in degrees]
    plt.plot(sineValues)
    plt.xlabel('degree')
    plt.ylabel('Sine Values')
    plt.title('Sine Curve')
    plt.grid()


def cosineCurve():
    plt.subplot(2,1,2)
    degrees = range(0, 360 + 1)
    cosineValues = [math.cos(math.radians(i)) for i in degrees]
    plt.plot(cosineValues)
    plt.xlabel("Degree")
    plt.ylabel("Cosine Values")
    plt.title('Cosine Curve')
    plt.grid()

def main():
    sineCurve()
    cosineCurve()
    plt.tight_layout()
    plt.savefig("sinCos")
    plt.show()

if __name__ == "__main__":
    main()
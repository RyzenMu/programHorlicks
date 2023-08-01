# printing top ten perfect square values using yield

def sec():
    for k in range(11, 21):
        yield k*k


for kj in sec():
    print(kj)
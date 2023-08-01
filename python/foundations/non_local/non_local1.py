# nonlocal keyword

def outer():
    var = 10
    def inner():
        print(var)
    inner()


outer()
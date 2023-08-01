#non local variable

def outer_function():
    variable_1 = 12
    variable_2 = 12
    def inner_function():
        nonlocal variable_1
        variable_2 = 76 # variable 2 not used by the outer function
        variable_1 = 76
    inner_function()
    print(variable_1)
    print(variable_2)

outer_function()

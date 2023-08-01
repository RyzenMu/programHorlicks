# Getting the personal details of students using try 
print("")

print("Good Morning Welcome to the Students Portal")
print("")
try:
    name = str(input("Enter Your Name: "))
    number = int(input("Enter Your Roll Number :"))
except TypeError:
    print("Please Enter Your Number")
except Exception:
    print("Enter Your number ")
finally:
    print("Thank You for Submitting Your details", name)

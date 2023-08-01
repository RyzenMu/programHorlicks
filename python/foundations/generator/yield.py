# Yield / Generator

def main():
    yield "hello"
    yield " "
    yield "Muruga"
    yield "Nantham"

print(main().__next__())

print("-------------")
print(main().__next__())

print("-------------")
print(main().__next__())

print("-------------")

for word in main():
    print(word)
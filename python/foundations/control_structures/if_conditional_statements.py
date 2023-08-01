

def moderate(marks, passMarks):
    if marks == passMarks-1 or marks == passMarks-2:
        marks = passMarks
    return marks


def main():
    passMarks = 40
    marks = input("Enter Marks : ")
    intMarks = int(marks)
    moderatedMarks = moderate(intMarks, passMarks)
    print('Moderated Marks : ', moderatedMarks)

if __name__ == "__main__":
    main()
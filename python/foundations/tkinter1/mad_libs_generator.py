
from tkinter import *

root = Tk()

root.geometry("720x720")
root.title("Channel")

Label(root, text="Welcome!", font="sans-sherif 20 bold").grid(row=5, column=4)

Label(root, text="to", font="sans-sherif 20").grid(row=4, column=5)

Label(root, text="Youtube", font="sans-sherif 20").grid(row=2, column=6)

Label(root, text="Channel", font="sans-sherif 20").grid(row=1, column=7)



root.mainloop()
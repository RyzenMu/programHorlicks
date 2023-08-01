# import module
from tkinter import *


# initialize window
root = Tk()
root.geometry('300x300')
root.title('DataFlair  - Mad Libs Generator')
Label(root, text="Mad Libs Generator \n Have Fun!", font='arial 20 bold').pack()
Label(root, text="Click Any One :", font='arial 15 bold').place(x=40, y=80)

def madlib1():

    animals = input('enter a animal name : ')
    profession = input('enter a profession name : ')
    cloth = input('enter a piece of cloth name : ')
    things = input('enter a thing name')
    name = input('enter a name')
    place = input('enter a place name')
    verb = input('enter a verb in ing form ')
    food = input('food name')
    print("say" + food + " , the photographer said as the camera flashed! " + name + "and i had gone to " + place + ' to get our photos taken today. The first photo we really wanted was a picture of us dressed as ' + animals + 'pretending to be a ' + profession + ' . when we saw the second photo, it was exactly what i wanted. we both looked like ' + things + "wearing " + cloth + ' and ' + verb + ' -- exactly what i had in mind')

# Buttons
Button(root, text="The photographer", command=madlib1, font='arial 15 bold', bg='ghost white').place(x = 40, y=120)


root.mainloop()
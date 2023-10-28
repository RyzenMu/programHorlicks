from kivy.app import App 
from kivy.uix.button import Button 

class createButtonApp(App):
    def build(self):
        return Button(text = "hello")
    

if __name__ == '__main__':
    createButtonApp().run()
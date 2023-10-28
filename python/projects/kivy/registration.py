from kivy.app import App 
from kivy.uix.button import Button 
from kivy.uix.label import Label 
from kivy.uix.textinput import TextInput
from kivy.uix.popup import Popup
from kivy.uix.gridlayout import GridLayout

class Register(GridLayout):
    def __init__(self):
        super(Register, self).__init__(cols=1, spacing=10, padding=150)
        self.add_widget(Label(text='User name'))
        self.add_widget(TextInput(multiline=False))
        self.add_widget(Label(text="password"))
        self.add_widget(TextInput(multiline=False, password=True))
        self.add_widget(Button(text='Register', on_press=self.displayPopup))

    def displayPopup(self, btn):
        myPopUp = Popup(title = 'Registration Status', content=Label(text='Registration successful'), size_hint=(.5, .5))
        myPopUp.open()


class RegistrationApp(App):
    def build(self):
        return Register()
    
if __name__ == '__main__':
    RegistrationApp().run()
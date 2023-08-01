import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radioButtons
{
public static void main(String args[])
{
new MyFrame();
}
}


class MyFrame extends JFrame implements ActionListener
{
JRadioButton pizzaButton;
JRadioButton hamburgerButton;
JRadioButton hotdogButton;
MyFrame()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());

pizzaButton = new JRadioButton("Pizza");
hamburgerButton = new JRadioButton("Hamburger");
hotdogButton = new JRadioButton("Hotdog");

ButtonGroup lunchGroup = new ButtonGroup();
lunchGroup.add(pizzaButton);
lunchGroup.add(hamburgerButton);
lunchGroup.add(hotdogButton);

pizzaButton.addActionListener(this);
hamburgerButton.addActionListener(this);
hotdogButton.addActionListener(this);

this.add(pizzaButton);
this.add(hamburgerButton);
this.add(hotdogButton);
this.pack();
this.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==pizzaButton)
{
System.out.println("You have selected pizza");
}
else if(e.getSource()==hamburgerButton)
{
System.out.println("You have selected Hamburger");
}
else
{
System.out.println("You have selected Hotdog");
}
}

}
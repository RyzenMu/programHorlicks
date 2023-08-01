import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;



public class newWindowBasics
{
public static void main(String args[])
{
LaunchPage launchPage = new LaunchPage();
}

}

class LaunchPage 
{
JFrame frame = new JFrame();
JButton myButton = new JButton("New Window");
   
LaunchPage()
{
myButton.setBounds(100, 160, 100, 40);
myButton.setFocusable(false);
myButton.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==myButton)
{
frame.dispose();
newWindow myWindow = new newWindow();
}
}
});
frame.add(myButton);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(420, 420);
frame.setLayout(null);
frame.setVisible(true);
}


}


class newWindow
{
JFrame frame = new JFrame();
JLabel label = new JLabel("Hello");
newWindow()
{
label.setBounds(0, 0, 100, 50);
label.setFont(new Font(null, Font.PLAIN, 25));
frame.add(label);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(420, 420);
frame.setLayout(null);
frame.setVisible(true);
}
}
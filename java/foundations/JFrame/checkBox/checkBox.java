import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class checkBox
{
public static void main(String args[])
{
// JCheckBox = A gui component that can be selected or deselected

new MyFrame();

}


}

class MyFrame extends JFrame implements ActionListener
{
JButton button;
JCheckBox checkBox;
ImageIcon icon1 = new ImageIcon("Thumb1.png");
ImageIcon icon2 = new ImageIcon("9010.jpg");
MyFrame()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());

button = new JButton();
button.setText("Submit");
button.addActionListener(this);

checkBox = new JCheckBox();
checkBox.setText("I am not a robot");
checkBox.setFocusable(false);
checkBox.setFont(new Font("Consolas", Font.PLAIN, 22));
checkBox.setIcon(icon1);
checkBox.setSelectedIcon(icon2);

this.add(checkBox);
this.add(button);
this.pack();
this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e)
{
if (e.getSource() == button)
{
System.out.println(checkBox.isSelected());
}
}
}
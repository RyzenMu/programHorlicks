import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame.*;

public class textField
{
public static void main(String args[])
{
MyFrame frame = new MyFrame();
}


}

class MyFrame extends JFrame implements ActionListener
{
JButton button;
JTextField textField;
MyFrame()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());
button = new JButton("Submit");
button.addActionListener(this);
textField = new JTextField();
textField.setPreferredSize(new Dimension(250, 40));
textField.setFont(new Font("Consolas", Font.PLAIN, 35));
textField.setForeground(new Color(110, 50, 77));
textField.setBackground(new Color(90, 150, 130));
textField.setCaretColor(new Color(50, 50, 50));
textField.setText("Please enter");
this.add(button);
this.add(textField);
this.pack();
this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==button)
{
System.out.println("Welcome " + textField.getText());
textField.setEditable(false);
button.setEnabled(false);
}
}
}



//jfile chooser
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFileChooser.*;

public class JFileChooser
{
public static void main(String args[])
{
MyFrame frame = new MyFrame();
}
}

class MyFrame extends JFrame implements ActionListener
{
JButton button;
MyFrame()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());
button = new JButton("Select File");
button.addActionListener(this);
this.add(button);
this.pack();
this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==button)
{
JFileChooser fileChooser = new JFileChooser();
fileChooser.showOpenDialog(null);//select file to open 
}
}
}

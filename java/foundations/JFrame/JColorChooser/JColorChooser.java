import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFileChooser.*;

public class JColorChooser
{
public static void main(String args[])
{
MyFrame frame = new MyFrame();
}
}

class MyFrame extends JFrame implements ActionListener
{
JButton button;
JLabel label;
MyFrame()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());
button = new JButton("Pick a color");
button.addActionListener(this);
label = new JLabel();
label.setBackground(Color.white);
label.setOpaque(true);
label.setText("This is some sample text");
label.setFont(new Font("MV Boli", Font.PLAIN, 33));
this.add(button);
this.add(label);
this.pack();
this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==button)
{
JColorChooser jcc = new JColorChooser();
Color color = JColorChooser.showDialog(null, "Pick a c", Color.black); 
label.setForeground(color);
}
}
}
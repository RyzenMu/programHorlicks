import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonActionListener6
{
public static void main(String args[])
{

JFrame f = new JFrame("JButton Action Listener 6");
final JTextField tf = new JTextField();
tf.setBounds(50, 50, 100, 50);
JButton b = new JButton("Click Me");
b.setBounds(100, 100, 100, 50);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("You clicked");
}
}
);
b.setEnabled(false);
f.add(b);
f.add(tf);

f.setSize(600, 600);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
f.setVisible(true);

}



}
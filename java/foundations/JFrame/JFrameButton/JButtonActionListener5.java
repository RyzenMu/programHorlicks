import java.awt.event.*;
import javax.swing.*;

public class JButtonActionListener5
{
public static void main(String args[])
{
JFrame f = new JFrame("JFrame Action Listener 5");
final JTextField tf = new JTextField();
tf.setBounds(50, 50, 150, 20);
JButton b = new JButton("Click Me");
b.setBounds(50, 100, 95, 30);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
tf.setText("WElcome to Musiri");
}
}
);
f.add(b);
f.add(tf);
f.setSize(400, 400);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

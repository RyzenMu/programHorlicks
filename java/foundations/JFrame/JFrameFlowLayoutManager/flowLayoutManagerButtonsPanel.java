import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class flowLayoutManagerButtonsPanel
{
public static void main(String args[])
{
JFrame f = new JFrame();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(500, 500);
f.setLayout(new FlowLayout(FlowLayout.LEADING,10,100));//TRAILING, CENTER

JPanel p1 = new JPanel();
p1.setPreferredSize(new Dimension(250, 500));
p1.setBackground(Color.gray);
p1.setLayout(new FlowLayout());

JButton b1= new JButton("1");
JButton b2= new JButton("2");
JButton b3 = new JButton("3");
JButton b4 = new JButton("4");
JButton b5 = new JButton("5");
JButton b6 = new JButton("6");
JButton b7 = new JButton("7");
JButton b8 = new JButton("8");
JButton b9 = new JButton("9");

p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
f.add(p1);


f.setVisible(true);
}
}
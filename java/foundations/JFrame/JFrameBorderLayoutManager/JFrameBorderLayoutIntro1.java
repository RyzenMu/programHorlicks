import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class JFrameBorderLayoutIntro1
{
public static void main(String args[])
{
JFrame f = new JFrame();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(500, 500);
f.setLayout(new BorderLayout());
f.setVisible(true);

JPanel p1 = new JPanel();
JPanel p2 = new JPanel();
JPanel p3 = new JPanel();
JPanel p4 = new JPanel();
JPanel p5 = new JPanel();

p1.setPreferredSize(new Dimension(100, 100));
p2.setPreferredSize(new Dimension(100, 100));
p3.setPreferredSize(new Dimension(100, 100));
p4.setPreferredSize(new Dimension(100, 100));
p5.setPreferredSize(new Dimension(100, 100));

p1.setBackground(Color.red);
p2.setBackground(Color.blue);
p3.setBackground(Color.green);
p4.setBackground(Color.yellow);
p5.setBackground(Color.magenta);

f.add(p1, BorderLayout.NORTH);
f.add(p2, BorderLayout.SOUTH);
f.add(p3, BorderLayout.EAST);
f.add(p4, BorderLayout.WEST);
f.add(p5, BorderLayout.CENTER);

}

}
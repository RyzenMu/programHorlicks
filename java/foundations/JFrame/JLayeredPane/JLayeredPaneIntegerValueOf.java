import javax.swing.*;
import java.awt.*;

//JLayeredPane = Swing container that provides a third dimension

public class JLayeredPaneIntegerValueOf
{
public static void main(String[] args)
{
JLabel l1 = new JLabel();
l1.setOpaque(true);
l1.setBackground(Color.red);
l1.setBounds(50, 50, 200, 200);

JLabel l2 = new JLabel();
l2.setOpaque(true);
l2.setBackground(Color.blue);
l2.setBounds(100, 100, 200, 200);

JLabel l3 = new JLabel();
l3.setOpaque(true);
l3.setBackground(Color.green);
l3.setBounds(150, 150, 200, 200);

JLayeredPane lp = new JLayeredPane();
lp.setBounds(0, 0, 500, 500);
lp.add(l1, Integer.valueOf(0));
lp.add(l2, Integer.valueOf(2));
lp.add(l3, Integer.valueOf(1));

JFrame f = new JFrame("JLayered Pane");
f.add(lp);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(new Dimension(500, 500));
f.setLayout(null);
f.setVisible(true);

}


}
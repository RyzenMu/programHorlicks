import javax.swing.*;
import java.awt.*;
import javax.swing.border.*

//JLayeredPane = Swing container that provides a third dimension

public class JLayeredPaneDragLayer
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
lp.add(l1, JLayeredPane.DEFAULT_LAYER);
lp.add(l2, JLayeredPane.DEFAULT_LAYER);
lp.add(l3, JLayeredPane.DRAG_LAYER);

JFrame f = new JFrame("JLayered Pane");
f.add(lp);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(new Dimension(500, 500));
f.setLayout(null);
f.setVisible(true);

}


}
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class JPanelLabel extends JFrame
{
public static void main(String args[])
{
Border bdr = BorderFactory.createLineBorder(Color.pink, 5);
JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(750, 750);
jf.setTitle("JPanel Label");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setLayout(null);

JPanel redPanel = new JPanel();
redPanel.setBackground(Color.red);
redPanel.setBounds(0, 0, 250, 250);
JPanel bluePanel = new JPanel();
bluePanel.setBackground(Color.blue);
bluePanel.setBounds(250, 0, 250, 250);
JPanel greenPanel = new JPanel();
greenPanel.setBackground(Color.green);

ImageIcon img = new ImageIcon("thumb2.png");

JLabel lbl = new JLabel();
//jf.add(bdr);
lbl.setText("Hi");
lbl.setIcon(img);

redPanel.add(lbl);
jf.add(redPanel);
jf.add(bluePanel);
jf.add(greenPanel);

}
}
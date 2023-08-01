import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class JPanelLabel1 extends JFrame
{
public static void main(String args[])
{

Border bdr = BorderFactory.createLineBorder(Color.green, 3);
JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(750, 750);
jf.setTitle("JPanel JLabel ");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setLayout(null);

JLabel lbl = new JLabel();
lbl.setText("Hi");
ImageIcon img = new ImageIcon("thumb2.png");
lbl.setIcon(img);
lbl.setBorder(bdr);

JPanel redPanel = new JPanel();
redPanel.setBackground(Color.red);
redPanel.setBounds(0, 0, 250, 250);
JPanel bluePanel = new JPanel();
bluePanel.setBackground(Color.blue);
bluePanel.setBounds(250, 0, 250, 250);
JPanel greenPanel = new JPanel();
greenPanel.setBackground(Color.green);
greenPanel.setBounds(0, 250, 500, 250);
//greenPanel.setIcon(img);

redPanel.add(lbl);
bluePanel.add(lbl);
//greenPanel.add(lbl);
jf.add(redPanel);
jf.add(bluePanel);
jf.add(greenPanel);

}
}
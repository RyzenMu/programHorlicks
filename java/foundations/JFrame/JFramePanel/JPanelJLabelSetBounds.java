import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class JPanelJLabelSetBounds extends JFrame
{
public static void main(String args[])
{
ImageIcon img = new ImageIcon("thumb2.png");
JLabel lbl = new JLabel();
lbl.setText("Hi");
lbl.setIcon(img);
lbl.setVerticalAlignment(JLabel.TOP);
lbl.setHorizontalAlignment(JLabel.CENTER);
lbl.setBounds(100, 100, 100, 100);
JPanel redPanel = new JPanel(); 
JPanel bluePanel = new JPanel();
JPanel greenPanel = new JPanel();
redPanel.setBackground(Color.red);
bluePanel.setBackground(Color.blue);
greenPanel.setBackground(Color.green);
redPanel.setBounds(0, 0, 250, 250);
bluePanel.setBounds(250, 0, 250, 250);
greenPanel.setBounds(0, 250, 500, 250);

greenPanel.setLayout(null);
bluePanel.setLayout(null);
redPanel.setLayout(null);

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(750, 750);
jf.setTitle("JPanel Set Layout");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
greenPanel.add(lbl);
jf.add(greenPanel);
jf.add(bluePanel);
jf.add(redPanel);
jf.setLayout(null);

}
}
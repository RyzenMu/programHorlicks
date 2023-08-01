import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class JPanelSetBounds extends JFrame
{
public static void main(String args[])
{
JFrame jf = new JFrame();
jf.setVisible(true);
jf.setTitle("JPanel Set Bounds");
jf.setSize(750, 750);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setLayout(null);

JPanel redPanel = new JPanel();
redPanel.setBounds(0, 0, 250, 250);
redPanel.setBackground(Color.red);

JPanel bluePanel = new JPanel();
bluePanel.setBounds(250, 0, 250, 250);
bluePanel.setBackground(Color.blue);

JPanel greenPanel = new JPanel();
greenPanel.setBounds(0, 250, 500, 250);
greenPanel.setBackground(Color.green);

jf.add(redPanel);
jf.add(bluePanel);
jf.add(greenPanel);
}
}
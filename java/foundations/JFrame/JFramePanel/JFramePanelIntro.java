import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class JFramePanelIntro extends JFrame
{
public static void main(String args[])
{
JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(800, 800);
jf.setTitle("JFrame JPanel Introduction");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setLayout(null);

JPanel redPanel = new JPanel();
redPanel.setBackground(Color.red);
redPanel.setBounds(0, 0, 250, 250); 



jf.add(redPanel);
}
}
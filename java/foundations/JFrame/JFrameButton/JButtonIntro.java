import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class JButtonIntro extends JFrame
{
public static void main(String args[])
{
JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(500, 500);
jf.setTitle("JFrame JButton Introduction- Basic");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setLayout(null);

JButton btn = new JButton();
btn.setBounds(150, 150, 100, 50);

jf.add(btn);

}


}
import javax.swing.*;
import java.awt.*;

public class LabelSetBackground extends JFrame
{
public static void main(String args[])
{
JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400,400);
jf.setTitle("JLabel Background Color");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel lbl = new JLabel();
lbl.setText("Bro do you even code");
ImageIcon img = new ImageIcon("logo.png");
lbl.setIcon(img);
lbl.setForeground(new Color(200, 200, 200));
lbl.setHorizontalTextPosition(JLabel.CENTER);
lbl.setVerticalTextPosition(JLabel.TOP);
lbl.setIconTextGap(-190);

lbl.setBackground(new Color(50, 50, 50)); 
lbl.setOpaque(true);

jf.add(lbl);
}


}
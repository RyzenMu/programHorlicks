import javax.swing.*;
import java.awt.*;

public class LabelFontColor extends JFrame
{

public static void main(String args[])
{

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle("Label Font Color");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel lbl = new JLabel();
lbl.setText("Bro Do You Even Code");

ImageIcon img = new ImageIcon("logo.png");
lbl.setIcon(img);

lbl.setVerticalTextPosition(JLabel.TOP);
lbl.setHorizontalTextPosition(JLabel.RIGHT);

lbl.setForeground(new Color(112, 145, 189));

jf.add(lbl);

}


}
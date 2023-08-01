import javax.swing.*;
import java.awt.*;

public class LabelVerticalTextPosition extends JFrame
{

public static void main(String args[])
{

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setTitle("Label Veritcal text Position");
jf.setSize(400, 400);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel lbl = new JLabel();
lbl.setText("Bro Code");

ImageIcon img = new ImageIcon("logo.png");
lbl.setIcon(img);

lbl.setVerticalTextPosition(JLabel.TOP);// TOP, BOTTOM or CENTER can be used
lbl.setHorizontalTextPosition(JLabel.CENTER);

jf.add(lbl);

}


}
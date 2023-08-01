import javax.swing.*;
import java.awt.*;

public class LabelImageIconTextPosition extends JFrame
{

public static void main(String args[])
{

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setTitle("Adjust Text Position");
jf.setSize(400, 400);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel lbl = new JLabel();
lbl.setText("Bro Code");

ImageIcon img = new ImageIcon("logo.png");
lbl.setIcon(img);
lbl.setHorizontalTextPosition(JLabel.CENTER);// JLabel.LEFT || JLabel.RIGHT

jf.add(lbl);

}


}
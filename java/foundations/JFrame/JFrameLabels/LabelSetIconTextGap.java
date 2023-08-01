import javax.swing.*;
import java.awt.*;

public class LabelSetIconTextGap extends JFrame
{

public static void main(String args[])
{

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle("Label Set Icon Text Gap");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel lbl = new JLabel();
lbl.setText("Label Set Icon Text Gap");

ImageIcon img = new ImageIcon("logo.png");
lbl.setIcon(img);

lbl.setHorizontalTextPosition(JLabel.CENTER);
lbl.setVerticalTextPosition(JLabel.TOP);
lbl.setForeground(new Color(125, 122, 144));
lbl.setFont(new Font("MV Boli", Font.PLAIN, 34));
lbl.setIconTextGap(100);

jf.add(lbl);

}

}
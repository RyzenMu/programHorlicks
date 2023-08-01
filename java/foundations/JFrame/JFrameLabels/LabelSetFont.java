import javax.swing.*;
import java.awt.*;

public class LabelSetFont extends JFrame
{

public static void main(String args[])
{

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle("Label Set Font");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel lbl = new JLabel();
lbl.setText("Bro do you even code");

ImageIcon img = new ImageIcon("logo.png");
lbl.setIcon(img);

lbl.setHorizontalTextPosition(JLabel.CENTER);
lbl.setVerticalTextPosition(JLabel.TOP);
lbl.setForeground(new Color(150, 150, 150));
lbl.setFont(new Font("MV Boli",  Font.PLAIN, 33));

jf.add(lbl);

}

}
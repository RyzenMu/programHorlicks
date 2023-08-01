import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class LabelSetHorizontalAlignment extends JFrame
{
public static void main(String args[])
{
Border bdr = BorderFactory.createLineBorder(Color.green, 5);
JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle("Label Set Horizontal Alignment");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel lbl = new JLabel();
lbl.setText("Bro do you even code");
lbl.setHorizontalTextPosition(JLabel.RIGHT);
lbl.setVerticalTextPosition(JLabel.TOP);
lbl.setFont(new Font("MV Bali", Font.ITALIC, 33));
lbl.setIconTextGap(35);
lbl.setForeground(new Color(125, 200, 50));
lbl.setBackground(new Color(125, 50, 200));
lbl.setOpaque(true);
lbl.setBorder(bdr);
lbl.setVerticalAlignment(JLabel.CENTER);
lbl.setHorizontalAlignment(JLabel.CENTER);

ImageIcon img = new ImageIcon("logo.png");
lbl.setIcon(img);

jf.add(lbl);
}
}
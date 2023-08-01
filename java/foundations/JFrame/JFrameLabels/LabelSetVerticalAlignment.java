import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class LabelSetVerticalAlignment extends JFrame
{
public static void main(String args[])
{
Border bdr = BorderFactory.createLineBorder(Color.green,3);

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle("Label Set Vetical Alignment");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel lbl = new JLabel();
lbl.setText("Bro Do you even code");
ImageIcon img = new ImageIcon("logo.png");
lbl.setIcon(img);
lbl.setHorizontalTextPosition(JLabel.CENTER);
lbl.setVerticalTextPosition(JLabel.TOP);
lbl.setIconTextGap(33);
lbl.setForeground(new Color(222, 98, 125));
lbl.setBackground(new Color(35, 155, 100));
lbl.setOpaque(true);
lbl.setFont(new Font("MV Boli", Font.ITALIC, 33));
lbl.setBorder(bdr);
lbl.setVerticalAlignment(JLabel.TOP);

jf.add(lbl);


}

}
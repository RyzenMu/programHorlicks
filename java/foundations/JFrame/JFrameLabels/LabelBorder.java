import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class LabelBorder extends JFrame
{
public static void main(String args[])
{

Border bdr = BorderFactory.createLineBorder(new Color(125, 125, 125), 3);
JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle("JLabel Border");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


JLabel lbl = new JLabel();

lbl.setBorder(bdr);
lbl.setText("Bro do you even code");
ImageIcon img = new ImageIcon("logo.png");
lbl.setIcon(img);
lbl.setHorizontalTextPosition(JLabel.CENTER);
lbl.setVerticalTextPosition(JLabel.TOP);
lbl.setForeground(new Color(200, 200, 200));
lbl.setBackground(new Color(55,55,55));
lbl.setOpaque(true);
lbl.setFont(new Font("MV Boli", Font.PLAIN, 33));


jf.add(lbl);

}
}
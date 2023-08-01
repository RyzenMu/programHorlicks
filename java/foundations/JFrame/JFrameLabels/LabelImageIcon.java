import javax.swing.*;
import java.awt.*;

public class LabelImageIcon extends JFrame
{


public static void main(String args[])
{

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle("Label Image Icon");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel lbl = new JLabel();



ImageIcon img = new ImageIcon("logo.png");
lbl.setIcon(img);
lbl.setText("Bro Code");


jf.add(lbl);


}



}
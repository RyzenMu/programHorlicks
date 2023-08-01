import javax.swing.*;
import java.awt.*;

public class labelIntro extends JFrame
{

public static void main(String args[])
{

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle("Label Intro");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel lbl = new JLabel();
lbl.setText("Bro do you even code");

jf.add(lbl);


}

}
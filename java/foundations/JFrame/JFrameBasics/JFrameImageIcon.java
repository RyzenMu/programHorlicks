import javax.swing.*;

public class JFrameImageIcon extends JFrame
{

public static void main(String args[])
{
JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle("JFrame Image Icon");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setResizable(false);


ImageIcon img = new ImageIcon("logo.png");
jf.setIconImage(img.getImage());

}

}
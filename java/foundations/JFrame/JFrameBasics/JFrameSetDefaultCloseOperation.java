import javax.swing.*;

public class JFrameSetDefaultCloseOperation extends JFrame
{

public static void main(String args[])
{

JFrame jf = new JFrame();
jf.setSize(400, 400);
jf.setTitle("This is default close operation");
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}



}
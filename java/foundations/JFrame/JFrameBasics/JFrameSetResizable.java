import javax.swing.*;

public class JFrameSetResizable extends JFrame
{

public static void main(String args[])
{

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle("JFrame Set Resizable");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setResizable(false);

}



}
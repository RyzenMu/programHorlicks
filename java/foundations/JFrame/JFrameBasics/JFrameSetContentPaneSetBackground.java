import javax.swing.*;
import java.awt.*;

public class JFrameSetContentPaneSetBackground extends JFrame 

{

public static void main(String args[])

{

JFrame jf = new JFrame();
jf.setVisible(true);
jf.setSize(400, 400);
jf.setTitle(" JFrame Set Content Pane / Set Background");
jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
jf.setResizable(false);

ImageIcon img = new ImageIcon("logo.png");
jf.setIconImage(img.getImage());
jf.getContentPane().setBackground(Color.blue);

}



}
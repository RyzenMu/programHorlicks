import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameClass extends JFrame
{
    JFrameClass(){
        this.setSize(420, 420); // sets the size of the this
        this.setTitle("JFrame title goes hereS");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close
        this.setResizable(false);// prevent resizing of this

        this.setVisible(true);

        ImageIcon image = new ImageIcon("girl.jpg");
        this.setIconImage(image.getImage()); // change icon of this

        //change background color of the this
        this.getContentPane().setBackground(Color.BLUE);
        this.getContentPane().setBackground(new Color(255, 155, 55, 100));
        this.getContentPane().setBackground(new Color(0x349aca));
    }    
}

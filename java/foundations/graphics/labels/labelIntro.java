import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class labelIntro {

    // jLabel is an area for text or image

    public static void main(String args[]){

        JLabel label = new JLabel(null, null, 0);// create a label
        label.setText("bro, do you even code"); // set text on label
        label.setHorizontalTextPosition(JLabel.RIGHT); // SET TEXT LEFT, CENTER, RIGHT
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM

        // ImageIcon image = new ImageIcon(Images.class.getResource("icecream.png"));
        // label.setIcon(image);
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500, 500);
        frame1.setVisible(true);

        frame1.add(label);
    }
    
}

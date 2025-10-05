//j2dGraphics
import java.awt.*;
import javax.swing.*;

public class J2dGraphics
{
public static void main(String args[])
{
new MyFrame();
}
}

class MyPanel extends JPanel
{
Image image;

MyPanel()
{

image = new ImageIcon("thumb.png").getImage();
this.setPreferredSize(new Dimension(500, 500));
}
public void paint(Graphics g)
{
Graphics2D g2D = (Graphics2D) g;
g2D.setPaint(Color.blue);
g2D.setStroke(new BasicStroke(4));
g2D.drawLine(0, 0, 500, 500);
g2D.setPaint(Color.pink);
//g2D.drawRect(0, 0 , 100, 200);
g2D.fillRect(0, 0, 100, 200);
g2D.setPaint(Color.black);
g2D.drawOval(200, 200, 50, 50);
g2D.setPaint(Color.gray);
g2D.fillOval(233, 344, 50, 50);
g2D.setPaint(Color.red);
g2D.drawArc(250, 300, 25, 25, 0, 180);
g2D.fillArc(350, 300, 25, 25, 0, 180);
int[] xPoints = {150, 250, 350};
int[] yPoints = {300, 150, 300};
g2D.setPaint(Color.green);
g2D.drawPolygon(xPoints, yPoints, 3);
g2D.setFont(new Font("M V Bali", Font.PLAIN, 15));
g2D.setFont(new Font("Ink Free", Font.PLAIN, 15));
g2D.drawString("U R A FOOL", 400, 400);
g2D.drawImage(image, 400, 0, null);
}
}

class MyFrame extends JFrame
{
MyPanel panel;
MyFrame()
{
panel = new MyPanel();
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//this.setSize(500, 500);
this.add(panel);
this.pack();
this.setLocationRelativeTo(null);
this.setVisible(true);
}
/*public void paint(Graphics g)
{
Graphics2D g2D = (Graphics2D) g;
g2D.drawLine(0, 0, 500, 500);
}*/
}

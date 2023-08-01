import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class animations
{
public static void main(String args[])
{
new MyFrame();
}
}
class MyPanel extends JPanel implements ActionListener
{
final int PANEL_WIDTH = 500;
final int PANEL_HEIGHT = 500;
Image image;
Image backgroundImage;
Timer timer;
int xVelocity = 2;
int yVelocity = 1;
int x = 0;
int y = 0;

MyPanel()
{
this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
this.setBackground(Color.black);
image = new ImageIcon("thumb.png").getImage();
backgroundImage = new ImageIcon("chackra.png").getImage();
timer = new Timer(10, this);
timer.start();
}
public void paint(Graphics g)
{
super.paint(g);
Graphics2D g2D = (Graphics2D) g;
g2D.drawImage(backgroundImage, 0, 0, null);
g2D.drawImage(image, x, y, null);
}
@Override
public void actionPerformed(ActionEvent e)
{
if(x>=PANEL_WIDTH-image.getWidth(null) || x<0)
{
xVelocity = xVelocity * -1;
}
x = x + xVelocity;
if(y>=PANEL_HEIGHT-image.getHeight(null) || y<0)
{
yVelocity = yVelocity * -1;
}
y = y + yVelocity;
repaint();
}
}





class MyFrame extends JFrame
{
MyPanel panel;
MyFrame()
{
panel = new MyPanel();
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.add(panel);
this.pack();
this.setLocationRelativeTo(null);
this.setVisible(true);
}

}
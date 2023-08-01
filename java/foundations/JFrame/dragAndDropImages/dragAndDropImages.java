import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class dragAndDropImages
{
public static void main(String args[])
{
MyFrame myframe = new MyFrame();
}
}

class DragPanel extends JPanel
{
ImageIcon image = new ImageIcon("thumb1.png");
final int WIDTH = image.getIconWidth();
final int HEIGHT = image.getIconHeight();
Point imageCorner;
Point prevPt;

DragPanel()
{
imageCorner = new Point(0, 0);
ClickListener clickListener = new ClickListener();
DragListener dragListener = new DragListener();
this.addMouseListener(clickListener);
this.addMouseMotionListener(dragListener);

}
public void paintComponent(Graphics g)
{
super.paintComponent(g);
image.paintIcon(this, g, (int)imageCorner.getX(),(int)imageCorner.getY());
}
private class ClickListener extends MouseAdapter
{
public void mousePressed(MouseEvent e)
{
prevPt = e.getPoint();
}
}
private class DragListener extends MouseMotionAdapter
{
public void mouseDragged(MouseEvent e)
{
Point currentPt = e.getPoint();
imageCorner.translate(
(int)(currentPt.getX()-prevPt.getX()),
(int)(currentPt.getY()-prevPt.getY())
);
prevPt = currentPt;
repaint();
}
}

}

class MyFrame extends JFrame
{
DragPanel dragPanel = new DragPanel();
MyFrame()
{
this.add(dragPanel);
this.setTitle("Drag and Drop Demo");
this.setSize(600, 600);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
 
}
}


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class mouseActionListener
{
public static void main(String args[])
{
MyFrame frame = new MyFrame();
}
}

class MyFrame extends JFrame implements MouseListener
{
JLabel label;
MyFrame()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(500, 500);
this.setLayout(null);
label = new JLabel();
label.setBounds(0, 0, 100, 100);
label.setBackground(Color.red);
label.setOpaque(true);
label.addMouseListener(this);
this.add(label);
this.setVisible(true);
}
@Override
public void mouseClicked(MouseEvent e)
{
//Invoked when the mouse button has beed clicked(Pressed and released) 
//on a component
System.out.println("You clicked the Mouse");
label.setBackground(Color.yellow);
}
@Override
public void mousePressed(MouseEvent e)
{
//Invoked when a mouse button has been pressed on a component
System.out.println("You pressed the mouse");
}
@Override
public void mouseReleased(MouseEvent e)
{
//Invoked when a mouse button has been released on a component
System.out.println("You released the mouse");
}
@Override
public void mouseEntered(MouseEvent e)
{
//Invoked when the mouse enters a component
System.out.println("You enterd the mouse");
}
@Override
public void mouseExited(MouseEvent e)
{
//invoked when the mouse exits a component
System.out.println("You exited the mouse");
}
}
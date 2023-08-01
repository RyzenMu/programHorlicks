import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFileChooser.*;
import javax.swing.event.*;

public class keyActionListener
{
public static void main(String args[])
{
MyFrame frame = new MyFrame();
}
}

class MyFrame extends JFrame implements KeyListener
{

JLabel label;

MyFrame()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(500, 500);
this.setLayout(null);
this.addKeyListener(this);
label = new JLabel();
label.setBounds(0, 0, 100, 100);
label.setBackground(Color.red);
label.setOpaque(true);
this.add(label);
this.setVisible(true);
}
@Override
public void keyTyped(KeyEvent e)
{
switch(e.getKeychar())
{
case 'a': label.setLocation(label.getX()-1, label.getY()); 
break;
case 'w': label.setLocation(label.getX(), label.getY()-1); 
break;
case 's': label.setLocation(label.getX(), label.getY()+1); 
break;
case 'd': label.setLocation(label.getX()+1, label.getY()); 
break;

}
}
@Override
public void Keypressed(KeyEvent e)
{
switch(e.getKeyCode())
{
case 37: label.setLocation(label.getX()-1, label.getY()); 
break;
case 38: label.setLocation(label.getX(), label.getY()-1); 
break;
case 40: label.setLocation(label.getX(), label.getY()+1); 
break;
case 39: label.setLocation(label.getX()+1, label.getY()); 
break;

}

}
@Override
public void KeyReleased(KeyEvent e)
{
System.out.println("You released a key"+e.getKeyChar());
System.out.println("You released a code"+e.getKeyCode());
}

}
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class menuBar
{
public static void main(String args[])
{
MyFrame frame = new MyFrame();
}
}

class MyFrame extends JFrame implements ActionListener
{
JMenuItem loadItem;
JMenuItem saveItem;
JMenuItem exitItem;
MyFrame()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(500, 500);
this.setLayout(new FlowLayout());
JMenuBar menuBar = new JMenuBar();
JMenu fileMenu = new JMenu("File");
JMenu editMenu = new JMenu("Edit");
JMenu helpMenu = new JMenu("Help");
loadItem = new JMenuItem("Load");
saveItem = new JMenuItem("Save");
exitItem = new JMenuItem("Exit");
fileMenu.setMnemonic(KeyEvent.VK_F);//Alt +F
editMenu.setMnemonic(KeyEvent.VK_E);//Alt + E
helpMenu.setMnemonic(KeyEvent.VK_H);//ALt+H
loadItem.setMnemonic(KeyEvent.VK_L);
saveItem.setMnemonic(KeyEvent.VK_S);
exitItem.setMnemonic(KeyEvent.VK_E);
fileMenu.add(loadItem);
fileMenu.add(saveItem);
fileMenu.add(exitItem);
loadItem.addActionListener(this);
saveItem.addActionListener(this);
exitItem.addActionListener(this);
menuBar.add(fileMenu);
menuBar.add(editMenu);
menuBar.add(helpMenu);
this.setJMenuBar(menuBar);
this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==loadItem)
{
System.out.println("Loaded an item");
}
if(e.getSource()==saveItem)
{
System.out.println("You saved a file");
}
if(e.getSource()==exitItem)
{
System.exit(0);
}
}
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class comboBox
{
public static void main(String args[])
{
MyFrame frame = new MyFrame();
}
}

class MyFrame extends JFrame implements ActionListener
{
JComboBox comboBox;
MyFrame()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());

String[] animals = {"dog", "cat", "bird"};
comboBox = new JComboBox(animals);
comboBox.addActionListener(this);
// comboBox.setEditable(true);
System.out.println(comboBox.getItemCount());
comboBox.addItem("horse");
comboBox.insertItemAt("gitaffee", 1);
comboBox.setSelectedIndex(1);
comboBox.removeItem("bird");
comboBox.removeItemAt(3);
//comboBox.removeAllItems();
this.add(comboBox);
this.pack();
this.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==comboBox)
{
System.out.println(comboBox.getSelectedItem());
System.out.println(comboBox.getSelectedIndex());
System.out.println();
}
}

}
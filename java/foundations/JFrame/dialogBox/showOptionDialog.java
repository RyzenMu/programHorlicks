import javax.swing.*;
import java.awt.*;

public class showOptionDialog
{
public static void main(String args[])
{
ImageIcon icon = new ImageIcon("thumb1.png");
//icon.setBounds(10, 10,20, 20);
JOptionPane.showOptionDialog(null, "Your are awesome", "secret message",
JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
icon, null, 0);

}

}
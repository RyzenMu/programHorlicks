import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class dialogBoxBasics
{
public static void main(String args[])
{
/* JOptionPane = Pop up a standard dialog box that prompts users for a value
or informs them of something */
JOptionPane.showMessageDialog(null, "This is some info", "title", 
JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null, "Information Message", "title", 
JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null, "Question Message", "title",
JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "Warning Message", "title",
JOptionPane.WARNING_MESSAGE);
JOptionPane.showMessageDialog(null, "Error Message", "title",
JOptionPane.ERROR_MESSAGE);


}

}
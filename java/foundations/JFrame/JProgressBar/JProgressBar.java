import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.JProgressBar.*;

public class JProgressBar
{
public static void main(String args[])
{
ProgressBarDemo progressBar = new ProgressBarDemo();
}
}

class ProgressBarDemo extends JFrame
{
JFrame frame = new JFrame();
JProgressBar bar = new JProgressBar();
ProgressBarDemo()
{
bar.setValue(0);
//pBar.setBounds(0, 0, 420, 50);
//frame.add(pBar);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(420, 420);
frame.setLayout(null);
frame.setVisible(true);
}
}
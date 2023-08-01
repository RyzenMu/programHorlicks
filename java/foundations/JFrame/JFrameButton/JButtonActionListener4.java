import java.awt.event.*;
import javax.swing.*;

public class JButtonActionListener4
{
	public static void main(String args[])
	{
	JFrame f = new JFrame("JButton Action Listener4");
	final JTextField tf = new JTextField();
	tf.setBounds(50, 50, 150, 20);
	//f.add(tf);
	JButton b = new JButton("Click Me!");
	b.setBounds(50, 100, 95, 30);
	b.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
			{
			tf.setText("Welcome to Musiri");
			System.out.println("Hello Musiri");
			}
		}
	);
	f.add(b);
	f.add(tf);
	f.setVisible(true);
	f.setSize(500, 500);
	f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
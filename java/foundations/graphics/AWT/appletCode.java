import java.io.*;
import java.awt.*;
import java.applet.*;
import java.applet.*;



// extending frame class to our class AWTExample1
public class appletCode extends Frame {

    appletCode(){

        // creating a button
        Button b = new Button("Click Me!");

        // setting button position on screen
        b.setBounds(30, 100, 80, 30);

        // adding button into frame
        add(b);

        // frame size 300 width 300 height
        setSize(300, 300);

        // Setting the title of the frame
        setTitle(("This is our basic AWT Example"));

        // no layout manager
        setLayout((null));

        // now frame will be visible, by default frame will not be visible
        setVisible(true);
    }

    // main method
    public static void main(String args[]){

        // creating instance of frame class
        appletCode a1 = new appletCode();
    }

  
    
    
}

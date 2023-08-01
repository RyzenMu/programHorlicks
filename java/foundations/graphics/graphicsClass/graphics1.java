import java.applet.Applet;

public class graphics1 extends Applet {
    String s = new String();
    String s1 = new String();
    String s2 = new String();
    Font f1 = new Font("Courier New", Font.BOLD, 20);
    public void paint (Graphics GA){
        GA.setFont(f1);
        GA.setColor(Color.blue);
        GA.drawString("Illustration of methods of Graphics class", 200, 520);
        Font f2 = GA.getFont();
        s = f2.toString();
        GA.drawString(s2, 5, 560);
        GA.drawString(s2, 5, 560);
        GA.drawString(s2, 5, 560);



    
    }
}

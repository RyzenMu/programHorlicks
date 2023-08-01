class Frame{
    int length;
    int width;
    int thickness;
    Frame(int lengtha, int widtha, int thicknessa){
        length = lengtha;
        width = widtha;
        thickness = thicknessa;
    }
    void printa(){
        System.out.println("The length is : "+ length);
        System.out.println("The width is : "+ width);
        System.out.println("The thickness is : "+ thickness);

    }
}

class Mirror extends Frame{
    Mirror(int x, int y, int z){
        super(x, y, z);
    }
}


public class Example3 {
    public static void main(String args[]){
        Frame f1 = new Frame(100, 88, 12);
        f1.printa();
        Mirror m1 = new Mirror(50, 40, 10);
        m1.printa();
    }
    
}

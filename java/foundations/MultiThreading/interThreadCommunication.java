class Circle {
    float radius = 0.0f;
    synchronized void output() {
        System.out.println("output Method invoked for disp[laying area of circle ...]");
        if (radius==0.0) {
            System.out.println("waiting for input radius ...");
            try{wait();}catch(Exception e){}
        }
        System.out.println("The area of circle is : " +3.14*radius*radius);
    }
    synchronized void input(float r) {
        System.out.println("Inputting Radius...");
        radius = r;
        System.out.println("radius value received ... ");
        notify();
    }
}

public class interThreadCommunication {
    public static void main(String[] args) {
        final Circle c = new Circle();
        new Thread() {
            public void run() {
                c.output();
            }
        }.start();
        new Thread() {
            public void run() {
                c.input(2.5f);
            }
        }.start();
    }
    
}

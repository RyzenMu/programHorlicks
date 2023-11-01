class Pyramid {
    public void draw_pyramid(char ch) {
        for (int i=0; i<10; i+=2) {
            for (int k=10-i; k>0; k-=2) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.println(ch);
            }
            System.out.println();
        }
    }
}

class A4 extends Thread {
    Pyramid p;
     A4(Pyramid p)
    {
        this.p =p;
    }
    public void run() {
        p.draw_pyramid('*');
    }
}

class B4 extends Thread {
    Pyramid p;
    B4(Pyramid p) {
        this.p = p;
    }
    public void run() {
        p.draw_pyramid('#');
    }

}


public class withoutSynchronization {
    public static void main(String[] args) {
        Pyramid pobj = new Pyramid();
        A4 threadA4 = new A4(pobj);
        B4 threadB4 = new B4(pobj);
        threadA4.start();
        threadB4.start();
        
    }
}

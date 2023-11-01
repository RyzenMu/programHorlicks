class A extends Thread {
    public void run() {
        for(int i=1; i<=500; i++) {
            System.out.println("\t From Thread A : I = " + i);
        }
        System.out.println("Exit From A");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 500; i++) {
            System.out.println("\t From Thread B : i = " + i);
        }
        System.out.println("Exit from B");
    }
} 

class C extends Thread {
    public void run() {
        for (int i=1; i<=500; i++) {
            System.out.println("\t From Thread C : i = " +i);
        }
        System.out.println("Exit From c");
    }
}


public class creatingThread {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
class A2 extends Thread {
    public void run() {
        System.out.println("ThreadA started");
        for(int i=1; i<=4; i++) {
            System.out.println("\t From Thread A : i = " + i);
        }
        System.out.println("Exit from A");
    }
}

class B2 extends Thread {
    public void run() {
        System.out.println("ThreadB strated");
        for (int j=1; j<=4; j++)  {
            System.out.println("\t From Thread B : j = " +j);
        }
        System.out.println("Exit from B");
    }
}

class C2 extends Thread {
    public void run() {
        System.out.println("ThreadC started");
        for (int k=0; k<=4; k++) {
            System.out.println("\t From Thread C : K = "+ k);
        }
        System.out.println("Exit from c");
    }
}




public class threadPriority {
    public static void main(String[] args) {
        A2 ThreadA = new A2();
        B2 ThreadB = new B2();
        C2 ThreadC = new C2();

        ThreadC.setPriority(Thread.MAX_PRIORITY);
        ThreadB.setPriority(ThreadA.getPriority()+1);
        ThreadA.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start Thread A");
        ThreadA.start();
        System.out.println("Start Thread B");
        ThreadB.start();
        System.out.println("Start Thread C");
        ThreadC.start();

        System.out.println("End of Main Thread");
    }
}

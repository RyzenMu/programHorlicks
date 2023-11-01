class A3 extends Thread {
    public void run() {
        System.out.println("This is Thread A \t Thread Id: " +Thread.currentThread().getId() + "\t Thread Priority : " + Thread.currentThread().getPriority() );
    }
}

class B3 extends Thread {
    public void run() {
        System.out.println("This is Thread B \t Thread id : " + Thread.currentThread().getId() + "\t Thread priority : " + Thread.currentThread().getPriority());
    }
}

class C3 extends Thread {
    public void run() {
        System.out.println("This is Thread C \t Thrad id :" + Thread.currentThread().getId() + "\t Thread priority : " + Thread.currentThread().getPriority());
    }
}


public class accessingThreadIdAndPriority {
    public static void main(String[] args) {
        A3 threadA = new A3();
        B3 threadB = new B3();
        C3 threadC = new C3();
        
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.NORM_PRIORITY);
        threadC.setPriority(Thread.MAX_PRIORITY);

        System.out.println("\n This is the main Thread \t Thread Id : " + Thread.currentThread().getId() + "\t Thread Priority : " + Thread.currentThread().getPriority() + "\n");

        threadA.start();
        threadB.start();
        threadC.start();
    }
}

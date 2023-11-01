class X implements Runnable {
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println("\t ThreadX " + i);
        }
        System.out.println("End of ThreadX");
    }
}


public class usingRunnableInterface {
    public static void main(String[] args) {
        X runnaX = new X();
        Thread threadX = new Thread(runnaX);
        threadX.start();
        System.out.println("End of Main thread");

    }
    
}

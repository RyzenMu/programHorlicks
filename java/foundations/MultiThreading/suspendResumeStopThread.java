class sus_res_stop implements Runnable {
    Thread Th;
    boolean suspend_flag, stop_flag;
    sus_res_stop(String tN) {
        Th = new Thread(this, tN);
        suspend_flag = false;
        stop_flag = false;
        Th.start();
    }
    public void run() {
        try {
            int j = 1;
            while(++j<20) {
                synchronized(this) {
                    while (suspend_flag) {
                        wait();                        
                    }
                    if (stop_flag) {
                        break;
                    }
                }
            }
        }catch (InterruptedException IE) {
            System.out.println("Thread Interupted");
        }
    }
    synchronized void my_suspend() {
        suspend_flag = true;
    }
    synchronized void my_resume() {
        suspend_flag = false;
        notify();
    }
    synchronized void my_stop() {
        suspend_flag = false;
        stop_flag = true;
        notify();
    }
}

public class suspendResumeStopThread {
    public static void main(String[] args) {
        try
        {
            sus_res_stop srst = new sus_res_stop("SRS");
            System.out.println("Thraed srst created and started");
            Thread.sleep(2000);
            srst.my_suspend();
            System.out.println("Thread srst suspended");
            Thread.sleep(2000);
            srst.my_resume();
            System.out.println("Thread srst resumed");
            Thread.sleep(2000);
            srst.my_suspend();
            System.out.println("Thread srst suspended");
            Thread.sleep(2000);
            srst.my_resume();
            System.out.println("Thread srst resumed");
            Thread.sleep(2000);
            srst.my_suspend();

        }
        catch(InterruptedException IE)
        {
            System.out.println("generated interupted exception");
        }
    }
    
}

class Q {
    int num;
    boolean valueSet = false;
    public synchronized void put(int num) {
        while (valueSet) {
            try{wait();}catch(Exception e){}
        }
        this.num = num;
        System.out.println("put "+num);
        valueSet = true;
        notify();
    }
    public synchronized void get() {
        while (!valueSet) {
            try{wait();}catch(Exception e){}
        }
        System.out.println("get "+num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    Q q;
    public Producer(Q q) { //constructor
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try{Thread.sleep(1500);}catch(Exception e){}
        }
    }
}

class Consumer implements Runnable {
    Q q;
    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }
    public void run() {
        while (true) {
            q.get();
            try{Thread.sleep(3000);}catch(Exception e){};
        }
    }
}





public class interThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

    }    
}

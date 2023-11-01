class A1 extends Thread {
    public void run () {
        for (int i = 1; i <=5; i++) {
            if (i==1) 
            {
                System.out.println(i);
                yield(); //Yield Method
            }
            System.out.println("\t From Thread A : i = " +i);
        }
        System.out.println("Exit From A ");
    }
}

class B1 extends Thread {
    public void run() {
        for (int j=1; j<=5; j++) {
            System.out.println("\t From Thread B : j = " +j);
            if (j==3) {
                stop(); //Stop method
            }
        }
        System.out.println(("Exit from B "));
    }
}

class C1 extends Thread {
    public void run() {
        for (int k=1; k<=5; k++) {
            System.out.println("\t From Thread c : k =" + k);
            if(k==1) {
                try{sleep(1000);}catch(Exception e){}
            }
        }
        System.out.println("Exit from c");
    }
}

public class usingThreadMethods {
    public static void main(String[] args) {
        A1 threadA = new A1();
        B1 threadB = new B1();
        C1 threadC = new C1();
        System.out.println("Start Thread A");
        threadA.start();
        System.out.println("Start Thread B");
        threadB.start();
        System.out.println("Start Thread C");
        threadC.start();
        System.out.println("End of main thread");
    }    
}

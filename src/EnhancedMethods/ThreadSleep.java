package EnhancedMethods;

import java.lang.*;

public class ThreadSleep implements Runnable {
    Thread t;
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            try {
                Thread.sleep(1000); // thread to sleep for 1000 milliseconds
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Thread t = new Thread(new ThreadSleep());
        t.start();  // call run() function

        Thread t2 = new Thread(new ThreadSleep());
        t2.start(); // call run() function
    }
}

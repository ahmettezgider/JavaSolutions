package Java8.JavaThreads;

public class Thread04{


    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i=0; i<10; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        };

        Thread t1 = new Thread(task1, "t1");
        Thread t2 = new Thread(task1, "t2");
        t1.start();
        t2.start();

    }
}

package Java8.JavaThreads;

public class Thread01 {
    // 1. Create a Java thread via Runnable using Classic Code

    public static void main(String[] args) {

        //-----------------------------------------------------------------
        Runnable task1 = new Runnable(){

            @Override
            public void run(){
                System.out.println("Task #1 is running");
            }
        };

        Thread thread1 = new Thread(task1);
        thread1.start();

        //-----------------------------------------------------------------
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Task #1 is running");
            }
        });

        thread2.start();
    }
}

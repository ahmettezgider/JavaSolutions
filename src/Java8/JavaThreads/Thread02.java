package Java8.JavaThreads;

public class Thread02 {

    // 2. Create a Java thread via Runnable using Lambda expression

    public static void main(String[] args) {
        // Lambda Runnable
        Runnable task2 = () -> { System.out.println("Task #2 is running"); };

        // start the thread
        new Thread(task2).start();
    }
}

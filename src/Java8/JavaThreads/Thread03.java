package Java8.JavaThreads;

public class Thread03 {
    int start;
    int end;

    Thread03(int start, int end) throws InterruptedException {
        this.start = start;
        this.end = end;

        for (int i=start; i<=end; i++){
            if (Thread.currentThread().getName().equalsIgnoreCase("thread-1"))
                System.out.println("\t" + i);
            else
                System.out.println(i);

            Thread.sleep(100);
        }
    }


    public static void main(String[] args) {
        new Thread(
                () -> {
                    try {
                        new Thread03(0,20);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
        ).start();

        Thread thread = new Thread(
                () -> {
                    try {
                        new Thread03(100,120);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
        );
        thread.start();


    }
}

import java.lang.Thread;
import java.lang.Runnable;
public class Main {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new Worker("Thread 1"));
        Thread thread2 = new Thread(new Worker("Thread 2"));

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class Worker implements Runnable {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

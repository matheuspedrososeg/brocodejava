package MultiThreading;

public class MainMain {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 = new MyThread();
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread1.join(3000); // calling thread waits until the specified time to join in after the main thread.
        thread2.start();

    }
}

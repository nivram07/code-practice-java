package code.practice.java;

import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ThreadsExample {

    public static void main(String[] args) throws InterruptedException {

        Thread out = new Thread(new PrinterRunnable());
        out.start();
        Thread.sleep(10000);
        out.join(1000);
        out.interrupt();
        System.out.format("%s\n", "Finished!");

        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);

        executor.submit(new PrinterRunnable());
        executor.submit(new PrinterRunnable());
        executor.submit(new PrinterRunnable());
        executor.submit(new PrinterRunnable());
        executor.submit(new PrinterRunnable());
        executor.submit(new PrinterRunnable());


    }

    public static class PrinterRunnable implements Runnable {
        private int id = new Random().nextInt(10);
        @Override
        public void run() {
            while (true) {
                System.out.format("%d: I'm running...\n", id);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException intEx) {
                    System.out.println("Thread has been interrupted!");
                    //throw new RuntimeException();
                    return;
                }
            }
        }
    }
}

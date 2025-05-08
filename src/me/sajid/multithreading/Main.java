package me.sajid.multithreading;

public class Main {
    public static void main(String[] args) {
        SharedResource res = new SharedResource(5);

        Producer p = new Producer(res, 10);
        Consumer c = new Consumer(res, 10);
        Consumer c1 = new Consumer(res, 5);

        Thread pThread = new Thread(p);
        Thread cThread = new Thread(c);
        // Thread c1Thread = new Thread(c1);

        pThread.start();
        cThread.start();

        try {
            // c1Thread.setDaemon(true);
            // cThread.setDaemon(true);
        } catch(Exception e) {
            //
        }
        // c1Thread.start();

        System.out.println("-----> Thread over " + Thread.currentThread().getName());
    }
}

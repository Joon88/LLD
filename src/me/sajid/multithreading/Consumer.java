package me.sajid.multithreading;

public class Consumer implements Runnable{
    SharedResource res;
    int capacity;
    public Consumer(SharedResource res, int cap) {
        this.res = res;
        capacity = cap;
    }

    @Override
    public void run() {
        System.out.println("CONSUMER::entry::" + Thread.currentThread().getName());
        while(capacity > 0) {
            res.consumeResource();
            try {
                Thread.sleep(3000L);
            } catch(Exception e) {
                //
            }
            capacity--;
        }
        System.out.println("CONSUMER::exit::" + Thread.currentThread().getName());
    }
}

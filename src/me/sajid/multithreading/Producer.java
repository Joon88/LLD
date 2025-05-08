package me.sajid.multithreading;

public class Producer implements Runnable {
    SharedResource res;
    int capacity;
    public Producer(SharedResource res, int cap) {
        this.res = res;
        capacity = cap;
    }

    @Override
    public void run() {
        System.out.println("PRODUCER::entry::" + Thread.currentThread().getName());
        while(capacity > 0) {
//            try {
//                Thread.sleep(5000L);
//            } catch (Exception e) {
//                //
//            }
            res.addResource(capacity*100);
            capacity--;
        }
        System.out.println("PRODUCER::exit::" + Thread.currentThread().getName());
    }
}

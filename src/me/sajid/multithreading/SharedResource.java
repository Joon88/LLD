package me.sajid.multithreading;

import java.util.ArrayDeque;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> q;
    private int size;

    public SharedResource(int s) {
        q = new ArrayDeque<>();
        size = s;
    }

    public synchronized void addResource(int res) {
        while(q.size() == size) {
            try {
                System.out.println("PRODUCER::Waiting " + Thread.currentThread().getName());
                wait();
                System.out.println("PRODUCER::Wait over " + Thread.currentThread().getName());
            } catch(Exception e) {
                //
            }
        }
        q.add(res);
        System.out.println("New resource " + res + " added by " + Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeResource() {
        while(q.isEmpty()) {
            try {
                System.out.println("CONSUMER::Waiting " + Thread.currentThread().getName());
                wait();
                System.out.println("CONSUMER::Wait over " + Thread.currentThread().getName());
            } catch(Exception e) {
                //
            }
        }
        int res = q.poll();
        System.out.println("Resource " + res + " consumed by " + Thread.currentThread().getName());
        notifyAll();
    }
}

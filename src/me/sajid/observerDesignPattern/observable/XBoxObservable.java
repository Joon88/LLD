package me.sajid.observerDesignPattern.observable;

import me.sajid.observerDesignPattern.observer.Observer;
import java.util.*;

public class XBoxObservable implements Observable {
    private List<Observer> observerList;
    private int data = 0;

    public XBoxObservable() {
        observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer o) {
        observerList.add(o);
    }

    @Override
    public void remove(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o : observerList)
            o.update();
    }

    @Override
    public void setData(int data) {
        if(this.data == 0) // data has just become non-zero (stock refill)
            notifyAllObservers();
        this.data = data;
    }

    @Override
    public int getData() {
        return data;
    }
}

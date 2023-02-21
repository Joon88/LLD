package me.sajid.observerDesignPattern.observable;

import me.sajid.observerDesignPattern.observer.Observer;

public interface Observable {
    public void add(Observer o);
    public void remove(Observer o);
    public void notifyAllObservers();
    public void setData(int data);
    public int getData();
}

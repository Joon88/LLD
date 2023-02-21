package me.sajid.observerDesignPattern.observer;

import me.sajid.observerDesignPattern.observable.Observable;

public class PopupObserver implements Observer {
    private Observable ob;
    private String phNo;

    public PopupObserver(String phNo, Observable ob) {
        this.ob = ob;
        this.phNo = phNo;
    }
    @Override
    public void update() {
        System.out.println("Hey " + phNo + ", here's the latest data : " + ob.getData());
    }
}

package me.sajid.observerDesignPattern.observer;

import me.sajid.observerDesignPattern.observable.Observable;

public class EmailObserver implements Observer {
    private Observable ob;
    private String email;

    public EmailObserver(String email, Observable ob) {
        this.ob = ob;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Hey " + email + ", here is the latest data : " + ob.getData());
    }
}

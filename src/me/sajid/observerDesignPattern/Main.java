package me.sajid.observerDesignPattern;

import me.sajid.observerDesignPattern.observable.Observable;
import me.sajid.observerDesignPattern.observable.PS5Observable;
import me.sajid.observerDesignPattern.observable.XBoxObservable;
import me.sajid.observerDesignPattern.observer.EmailObserver;
import me.sajid.observerDesignPattern.observer.Observer;
import me.sajid.observerDesignPattern.observer.PopupObserver;

public class Main {

    public static void main(String args[]) {
        Observable ps5 = new PS5Observable();
        Observable xbox = new XBoxObservable();

        Observer o1 = new EmailObserver("example@gmail.com", ps5);
        Observer o2 = new EmailObserver("example123@gmail.com", xbox);
        Observer o3 = new PopupObserver("1234567890", ps5);
        Observer o4 = new PopupObserver("9876543210", xbox);

        ps5.add(o1);
        xbox.add(o4);

        ps5.setData(5);
        xbox.setData(3);

        ps5.setData(0);
        xbox.setData(1);

        xbox.add(o2);
        ps5.add(o3);

        ps5.setData(1);
        xbox.setData(3);
    }
}

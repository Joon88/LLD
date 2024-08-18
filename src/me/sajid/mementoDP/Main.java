package me.sajid.mementoDP;

import me.sajid.mementoDP.originators.Originator;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(System.currentTimeMillis() - 100000);
        Configuration config = new Configuration(d1, "checksum1");
        System.out.println(config.createdOn + " --- " + config.checksum);
        Memento m = config.createMemento();

        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(m);

        config.createdOn = new Date(System.currentTimeMillis());
        config.checksum = "checksum2";
        System.out.println(config.createdOn + " --- " + config.checksum);
        Memento m1 = config.createMemento();
        caretaker.addMemento(m1);

        Memento restore = caretaker.restoreTo(d1);
        config.restoreMemento(restore);
        System.out.println(config.createdOn + " --- " + config.checksum);
    }
}

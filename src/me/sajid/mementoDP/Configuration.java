package me.sajid.mementoDP;

import me.sajid.mementoDP.originators.Originator;

import java.util.Date;

public class Configuration implements Originator {
    public Date createdOn;
    public String checksum;

    public Configuration(Date createdOn, String checksum) {
        this.createdOn = createdOn;
        this.checksum = checksum;
    }

    @Override
    public Memento createMemento() {
        return new Memento(createdOn, checksum);
    }

    @Override
    public void restoreMemento(Memento m) {
        createdOn = m.getCreatedOn();
        checksum = m.getChecksum();
        System.out.println("Memento restored");
    }
}

package me.sajid.mementoDP;

import java.util.Date;

public class Memento {
    private final Date createdOn;
    private final String checksum;

    public Memento(Date createdOn, String checksum) {
        this.createdOn = createdOn;
        this.checksum = checksum;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public String getChecksum() {
        return checksum;
    }
}

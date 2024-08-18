package me.sajid.mementoDP;

import java.util.*;

public class Caretaker {
    private Map<Date, Memento> history;

    public Caretaker() {
        history = new LinkedHashMap<>();
    }

    public void addMemento(Memento m) {
        history.put(m.getCreatedOn(), m);
        System.out.println("Memento added");
    }

    public Memento restoreTo(Date date) {
        if(history.isEmpty()) {
            System.out.println("Nothing in history to revert to!");
            return null;
        }
        return history.get(date);
    }
}

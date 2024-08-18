package me.sajid.mementoDP.originators;

import me.sajid.mementoDP.Memento;

public interface Originator {
    public Memento createMemento();
    public void restoreMemento(Memento m);
}

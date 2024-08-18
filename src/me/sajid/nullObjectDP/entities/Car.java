package me.sajid.nullObjectDP.entities;

public class Car implements Vehicle {

    @Override
    public int getFuel() {
        return 100;
    }

    @Override
    public int getWheels() {
        return 4;
    }
}

package me.sajid.nullObjectDP.entities;

public class NullVehicle implements Vehicle {
    @Override
    public int getFuel() {
        return 0;
    }

    @Override
    public int getWheels() {
        return 0;
    }
}

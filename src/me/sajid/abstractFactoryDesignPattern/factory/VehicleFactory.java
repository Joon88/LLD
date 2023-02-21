package me.sajid.abstractFactoryDesignPattern.factory;

import me.sajid.abstractFactoryDesignPattern.entity.Vehicle;

public interface VehicleFactory {
    public Vehicle getVehicle(String size);
}

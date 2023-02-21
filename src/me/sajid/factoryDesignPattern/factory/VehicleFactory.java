package me.sajid.factoryDesignPattern.factory;

import me.sajid.factoryDesignPattern.entity.Bike;
import me.sajid.factoryDesignPattern.entity.Car;
import me.sajid.factoryDesignPattern.entity.Vehicle;

public class VehicleFactory {
    public Vehicle getVehicle(String type) {
        switch(type) {
            case "4 wheeler":
                return new Car();
            case "2 wheeler":
                return new Bike();
            default:
                return null;
        }
    }
}

package me.sajid.abstractFactoryDesignPattern.factory;

import me.sajid.abstractFactoryDesignPattern.entity.Bike;
import me.sajid.abstractFactoryDesignPattern.entity.Car;
import me.sajid.abstractFactoryDesignPattern.entity.Truck;
import me.sajid.abstractFactoryDesignPattern.entity.Vehicle;

public class FourWheelerFactory implements VehicleFactory {
    public Vehicle getVehicle(String type) {
        switch(type) {
            case "big":
                return new Truck();
            case "small":
                return new Car();
            default:
                return null;
        }
    }
}

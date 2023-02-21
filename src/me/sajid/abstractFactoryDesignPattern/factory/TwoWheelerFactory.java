package me.sajid.abstractFactoryDesignPattern.factory;

import me.sajid.abstractFactoryDesignPattern.entity.Bike;
import me.sajid.abstractFactoryDesignPattern.entity.Scooter;
import me.sajid.abstractFactoryDesignPattern.entity.Vehicle;

public class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String size) {
        switch(size) {
            case "big":
                return new Bike();
            case "small":
                return new Scooter();
            default:
                return null;
        }
    }
}

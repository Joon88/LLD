package me.sajid.factoryDesignPattern;

import me.sajid.factoryDesignPattern.entity.Vehicle;
import me.sajid.factoryDesignPattern.factory.VehicleFactory;

public class Main {
    public static void main(String args[]) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("4 wheeler");
        v1.start();
        Vehicle v2 = factory.getVehicle("2 wheeler");
        v2.start();
    }
}

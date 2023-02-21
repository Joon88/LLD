package me.sajid.abstractFactoryDesignPattern;

import me.sajid.abstractFactoryDesignPattern.factory.FourWheelerFactory;
import me.sajid.abstractFactoryDesignPattern.factory.TwoWheelerFactory;
import me.sajid.abstractFactoryDesignPattern.factory.VehicleFactory;

public class Main {
    public static void main(String args[]) {
        VehicleFactory f1 = new FourWheelerFactory();
        f1.getVehicle("big").start();
        f1.getVehicle("small").start();

        VehicleFactory f2 = new TwoWheelerFactory();
        f2.getVehicle("big").start();
        f2.getVehicle("small").start();
    }
}

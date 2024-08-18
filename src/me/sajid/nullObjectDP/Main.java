package me.sajid.nullObjectDP;

import me.sajid.nullObjectDP.entities.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle v = factory.getVehicle("XYZ");
        System.out.println(v.getFuel() + " --- " + v.getWheels());

        Vehicle v1 = factory.getVehicle("4_WHEELER");
        System.out.println(v1.getFuel() + " --- " + v1.getWheels());
    }
}

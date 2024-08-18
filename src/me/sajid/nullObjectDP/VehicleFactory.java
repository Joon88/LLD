package me.sajid.nullObjectDP;

import me.sajid.nullObjectDP.entities.Car;
import me.sajid.nullObjectDP.entities.NullVehicle;
import me.sajid.nullObjectDP.entities.Vehicle;

public class VehicleFactory {
    public Vehicle getVehicle(String type) {
        switch(type) {
            case "4_WHEELER":
                return new Car();
            default:
                return new NullVehicle();
        }
    }
}

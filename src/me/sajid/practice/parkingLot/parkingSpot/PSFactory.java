package me.sajid.practice.parkingLot.parkingSpot;

import me.sajid.practice.parkingLot.VehicleType;

public class PSFactory {
    public static ParkingSpot createPS(VehicleType type) {
        switch(type) {
            case FOUR_WHEELER:
                return new FourWheelerPS();
            case TWO_WHEELER:
                return new TwoWheelerPS();
            default:
                return null;
        }
    }
}

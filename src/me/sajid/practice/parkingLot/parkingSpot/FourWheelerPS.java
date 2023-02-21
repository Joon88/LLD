package me.sajid.practice.parkingLot.parkingSpot;

import me.sajid.practice.parkingLot.VehicleType;

public class FourWheelerPS extends ParkingSpot{

    public FourWheelerPS() {
        super(VehicleType.FOUR_WHEELER, 100f);
    }

    public FourWheelerPS(float price) {
        super(VehicleType.FOUR_WHEELER, price);
    }
}

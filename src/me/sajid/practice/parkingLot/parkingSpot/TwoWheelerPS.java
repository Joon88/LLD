package me.sajid.practice.parkingLot.parkingSpot;

import me.sajid.practice.parkingLot.VehicleType;

public class TwoWheelerPS extends ParkingSpot {

    public TwoWheelerPS() {
        super(VehicleType.TWO_WHEELER, 50f);
    }

    public TwoWheelerPS(float price) {
        super(VehicleType.TWO_WHEELER, price);
    }
}

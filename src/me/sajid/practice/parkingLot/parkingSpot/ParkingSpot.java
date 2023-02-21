package me.sajid.practice.parkingLot.parkingSpot;

import me.sajid.practice.parkingLot.VehicleType;

public abstract class ParkingSpot {
    private VehicleType type;
    private boolean isEmpty;
    private float price;

    public ParkingSpot(VehicleType type, float price) {
        this.type = type;
        this.price = price;
        isEmpty = true;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean parkVehicle() {
        if(!isEmpty)
            return false;

        isEmpty = false;
        return true;
    }

    public boolean unparkVehicle() {
        if(isEmpty)
            return false;

        isEmpty = true;
        return true;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "type=" + type +
                ", isEmpty=" + isEmpty +
                ", price=" + price +
                '}';
    }
}

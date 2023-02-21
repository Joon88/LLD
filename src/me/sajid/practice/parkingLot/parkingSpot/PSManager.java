package me.sajid.practice.parkingLot.parkingSpot;

import java.util.*;

public abstract class PSManager {
    public static List<ParkingSpot> parkingSpotAvailableList = new ArrayList<>();
    public static List<ParkingSpot> parkingSpotOccupiedList = new ArrayList<>();

    public abstract void addPS(ParkingSpot ps);

    public abstract void removePS(ParkingSpot ps);

    public abstract ParkingSpot getParkingSpot();
    public abstract void freeParkingSpot(ParkingSpot ps);

    public void parkVehicle(ParkingSpot ps) {
        ps.parkVehicle();
    }

    public void unparkVehicle(ParkingSpot ps) {
        ps.unparkVehicle();
    }
}

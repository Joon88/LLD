package me.sajid.practice.parkingLot.parkingSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerPSManager extends PSManager {
    private List<TwoWheelerPS> parkingSpotAvailableList;
    private List<TwoWheelerPS> parkingSpotOccupiedList;

    public TwoWheelerPSManager() {
        parkingSpotAvailableList = new ArrayList<>();
        parkingSpotOccupiedList = new ArrayList<>();
    }

    public void addPS(ParkingSpot ps) {
        parkingSpotAvailableList.add((TwoWheelerPS) ps);
        PSManager.parkingSpotAvailableList.add(ps);
        getStatus();
    }

    public void removePS(ParkingSpot ps) {
        parkingSpotAvailableList.remove(ps);
        PSManager.parkingSpotAvailableList.remove(ps);
        getStatus();
    }

    public boolean isPSAvailable() {
        return parkingSpotAvailableList.size() > 0;
    }

    public ParkingSpot getParkingSpot() {
        // here proper parking spot finding strategy can be implemented, using strategy design pattern
        if (!isPSAvailable()) {
            return null;
        }
        TwoWheelerPS ps = parkingSpotAvailableList.remove(0);
        parkingSpotOccupiedList.add(ps);
        getStatus();
        return ps;
    }

    public void freeParkingSpot(ParkingSpot ps) {
        parkingSpotOccupiedList.remove(ps);
        parkingSpotAvailableList.add((TwoWheelerPS) ps);
        getStatus();
    }

    public void getStatus() {
        System.out.println("Available 2w parking spots : " + parkingSpotAvailableList.size());
        System.out.println("Occupied 2w parking spots : " + parkingSpotOccupiedList.size());
    }
}

package me.sajid.practice.parkingLot.parkingSpot;

import java.util.*;

public class FourWheelerPSManager extends PSManager {
    private List<FourWheelerPS> parkingSpotAvailableList;
    private List<FourWheelerPS> parkingSpotOccupiedList;

    public FourWheelerPSManager() {
        parkingSpotAvailableList = new ArrayList<>();
        parkingSpotOccupiedList = new ArrayList<>();
    }

    public void addPS(ParkingSpot ps) {
        parkingSpotAvailableList.add((FourWheelerPS) ps);
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
        FourWheelerPS ps = parkingSpotAvailableList.remove(0);
        parkingSpotOccupiedList.add(ps);
        getStatus();
        return ps;
    }

    public void freeParkingSpot(ParkingSpot ps) {
        parkingSpotOccupiedList.remove(ps);
        parkingSpotAvailableList.add((FourWheelerPS) ps);
        getStatus();
    }

    public void getStatus() {
        System.out.println("Available 4w parking spots : " + parkingSpotAvailableList.size());
        System.out.println("Occupied 4w parking spots : " + parkingSpotOccupiedList.size());
    }
}

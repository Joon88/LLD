package me.sajid.practice.parkingLot.parkingSpot;

import me.sajid.practice.parkingLot.VehicleType;
// Implementation of a singleton factory pattern
public class PSManagerFactory {
    private static PSManager twoWheelerPSManager;
    private static PSManager fourWheelerPSManager;

    public static synchronized PSManager createPSManager(VehicleType type) {
        switch(type) {
            case FOUR_WHEELER:
                if(fourWheelerPSManager == null)
                    fourWheelerPSManager = new FourWheelerPSManager();
                return fourWheelerPSManager;
            case TWO_WHEELER:
                if(twoWheelerPSManager == null)
                    twoWheelerPSManager = new TwoWheelerPSManager();
                return twoWheelerPSManager;
            default:
                return null;
        }
    }
}

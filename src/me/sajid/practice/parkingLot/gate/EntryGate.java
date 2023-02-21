package me.sajid.practice.parkingLot.gate;

import me.sajid.practice.parkingLot.Ticket;
import me.sajid.practice.parkingLot.VehicleType;
import me.sajid.practice.parkingLot.parkingSpot.PSManager;
import me.sajid.practice.parkingLot.parkingSpot.PSManagerFactory;
import me.sajid.practice.parkingLot.parkingSpot.ParkingSpot;
import me.sajid.practice.parkingLot.pricing.PricingStrategy;

public class EntryGate {
    private PSManager psManager;

    private ParkingSpot findParkingSpot(VehicleType type) {
        psManager = PSManagerFactory.createPSManager(type);

        ParkingSpot ps = psManager.getParkingSpot();

        return ps;
    }

    public Ticket createTicket(VehicleType type, String regnNo, PricingStrategy pStr) {
        System.out.println("Creating ticket for : " + regnNo);
        ParkingSpot ps = findParkingSpot(type);

        if(ps == null) {
            System.out.println("No parking spots !!!");
            return null;
        }

        // mark parking spot as filled
        psManager.parkVehicle(ps);

        Ticket ticket = new Ticket(regnNo, type, ps, pStr);
        return ticket;
    }
}

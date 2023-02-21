package me.sajid.practice.parkingLot.gate;

import me.sajid.practice.parkingLot.Ticket;
import me.sajid.practice.parkingLot.parkingSpot.PSManager;
import me.sajid.practice.parkingLot.parkingSpot.PSManagerFactory;
import me.sajid.practice.parkingLot.parkingSpot.ParkingSpot;
import me.sajid.practice.parkingLot.pricing.PricingStrategy;

import java.util.Date;

public class ExitGate {
    private PSManager psManager;

    public void releasePS(Ticket ticket) {
        // we know PSManager has been implemented as a singleton
        System.out.println("Releasing ticket : " + ticket);
        psManager = PSManagerFactory.createPSManager(ticket.getType());
        psManager.unparkVehicle(ticket.getPs());
        psManager.freeParkingSpot(ticket.getPs());
    }

    public float calculatePrice(Ticket ticket) {
        System.out.println("Calculating price for ticket : " + ticket);
        Date now = new Date();
        PricingStrategy pStr = ticket.getpStr();
        ParkingSpot ps = ticket.getPs();
        Date entryTime = ticket.getEntryTime();
        return pStr.calculatePrice(entryTime.getTime(), now.getTime(), ps.getPrice());
    }
}

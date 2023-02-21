package me.sajid.practice.parkingLot;

import me.sajid.practice.parkingLot.gate.EntryGate;
import me.sajid.practice.parkingLot.gate.ExitGate;
import me.sajid.practice.parkingLot.parkingSpot.*;
import me.sajid.practice.parkingLot.pricing.DailyPricingStrategy;
import me.sajid.practice.parkingLot.pricing.HourlyPricingStrategy;

public class Main {
    static PSManager psManager;
    public static void main(String args[]) {
        initialiseParkingSpots();

        EntryGate entry = new EntryGate();
        System.out.println("Vehicle 1 entry ---");
        Ticket t1 = entry.createTicket(VehicleType.FOUR_WHEELER, "AS15U1234", new DailyPricingStrategy());
        System.out.println("Vehicle 2 entry ---");
        Ticket t2 = entry.createTicket(VehicleType.FOUR_WHEELER, "AS15E5678", new HourlyPricingStrategy());

        ExitGate exit = new ExitGate();
        System.out.println("--- Vehicle 1 exit");
        exit.releasePS(t1);
        System.out.println(exit.calculatePrice(t1));

        System.out.println("Vehicle 3 entry ---");
        Ticket t3 = entry.createTicket(VehicleType.FOUR_WHEELER, "AS01E7890", new HourlyPricingStrategy());

        System.out.println("--- Vehicle 2 exit");
        exit.releasePS(t2);
        System.out.println("Final price is : " + exit.calculatePrice(t2));

        System.out.println("--- Vehicle 3 exit");
        exit.releasePS(t3);
        System.out.println("Final price is : " + exit.calculatePrice(t3));
    }

    private static void initialiseParkingSpots() {
        // add 3 two wheeler parking spots
        System.out.println("Initialise 2w parking spots ...");
        psManager = PSManagerFactory.createPSManager(VehicleType.TWO_WHEELER);
        for(int i = 0; i < 3; i++) {
            ParkingSpot ps = PSFactory.createPS(VehicleType.TWO_WHEELER);
            psManager.addPS(ps);
        }
        System.out.println(PSManager.parkingSpotAvailableList);
        System.out.println(PSManager.parkingSpotOccupiedList);
        // add 2 four wheeler parking spots
        System.out.println("Initialise 4w parking spots ...");
        psManager = PSManagerFactory.createPSManager(VehicleType.FOUR_WHEELER);
        for(int i = 0; i < 2; i++) {
            ParkingSpot ps = PSFactory.createPS(VehicleType.FOUR_WHEELER);
            psManager.addPS(ps);
        }
        System.out.println(PSManager.parkingSpotAvailableList);
        System.out.println(PSManager.parkingSpotOccupiedList);
    }
}

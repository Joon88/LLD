package me.sajid.practice.parkingLot.pricing;

public interface PricingStrategy {
    public float calculatePrice(long entryTime, long exitTime, float price);
}

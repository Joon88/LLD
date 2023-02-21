package me.sajid.practice.parkingLot.pricing;

public class HourlyPricingStrategy implements PricingStrategy{
    @Override
    public float calculatePrice(long entryTime, long exitTime, float price) {
        long timeDiff = exitTime - entryTime + (int)(Math.random()*100000);
        int hours = (int) Math.ceil(timeDiff/3600);
        return price*hours;
    }
}

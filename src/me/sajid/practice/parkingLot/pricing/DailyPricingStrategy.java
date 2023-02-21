package me.sajid.practice.parkingLot.pricing;

public class DailyPricingStrategy implements PricingStrategy{
    @Override
    public float calculatePrice(long entryTime, long exitTime, float price) {
        long timeDiff = exitTime - entryTime + (int)(Math.random()*1000000);
        int hours = (int) Math.ceil(timeDiff/(24*3600));
        return (float) (price*hours*0.75); // 25% daily plan discount
    }
}

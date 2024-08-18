package me.sajid.practice.parkingLot;

import me.sajid.practice.parkingLot.parkingSpot.ParkingSpot;
import me.sajid.practice.parkingLot.pricing.PricingStrategy;

import java.util.Date;

public class Ticket {
    private String regnNo;
    private VehicleType type;
    private Date entryTime;

    @Override
    public String toString() {
        return "Ticket{" +
                "regnNo='" + regnNo + '\'' +
                ", type=" + type +
                ", entryTime=" + entryTime +
                ", ps=" + ps +
                '}';
    }

    private ParkingSpot ps;
    private PricingStrategy pStr;

    public String getRegnNo() {
        return regnNo;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSpot getPs() {
        return ps;
    }

    public PricingStrategy getpStr() {
        return pStr;
    }

    public void setpStr(PricingStrategy pStr) {
        this.pStr = pStr;
    }

    public void setPs(ParkingSpot ps) {
        this.ps = ps;
    }

    public void setRegnNo(String regnNo) {
        this.regnNo = regnNo;
    }

    public Ticket(String regnNo, VehicleType type, ParkingSpot ps, PricingStrategy pStr) {
        this.regnNo = regnNo;
        this.type = type;
        this.ps = ps;
        this.pStr = pStr;
        entryTime = new Date();
    }
}

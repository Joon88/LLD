package me.sajid.commandDP;

public class AirConditioner {
    private String state;

    public AirConditioner() {
        this.state = "OFF";
    }

    public void turnOn() {
        state = "ON";
        System.out.println("AC is turned on");
    }

    public void turnOff() {
        state = "OFF";
        System.out.println("AC is turned off");
    }
}

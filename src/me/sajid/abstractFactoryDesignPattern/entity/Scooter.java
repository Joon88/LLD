package me.sajid.abstractFactoryDesignPattern.entity;

public class Scooter implements Vehicle{
    @Override
    public void start() {
        System.out.println("Starting a scooter");
    }
}

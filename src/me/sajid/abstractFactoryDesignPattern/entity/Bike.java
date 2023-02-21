package me.sajid.abstractFactoryDesignPattern.entity;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting a bike");
    }
}

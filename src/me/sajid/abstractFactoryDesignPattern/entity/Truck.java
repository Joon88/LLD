package me.sajid.abstractFactoryDesignPattern.entity;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Starting a truck");
    }
}

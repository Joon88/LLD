package me.sajid.factoryDesignPattern.entity;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Starting a car");
    }
}

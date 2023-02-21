package me.sajid.strategyDesignPattern.withoutStrategyDP;

public class Manager extends Employee {
    @Override
    public void workStrategy() {
        System.out.println("Management : managing people.");
    }
}

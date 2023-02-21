package me.sajid.strategyDesignPattern.withStrategyDP.strategy;

public class ManagementStrategy implements WorkStrategy {

    @Override
    public void workStrategy() {
        System.out.println("Manage people.");
    }
}

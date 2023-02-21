package me.sajid.strategyDesignPattern.withoutStrategyDP;

public class Engineer extends Employee {
    // the following override is code duplication between this class and SREngineer class
    @Override
    public void workStrategy() {
        System.out.println("Technical : doing technical stuff.");
    }
}

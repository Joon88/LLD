package me.sajid.strategyDesignPattern.withoutStrategyDP;

public class SREngineer extends Employee {
    // the following override is code duplication between this class and Engineer class
    @Override
    public void workStrategy() {
        System.out.println("Technical : doing technical stuff.");
    }
}

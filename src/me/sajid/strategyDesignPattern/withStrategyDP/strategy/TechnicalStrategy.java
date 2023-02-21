package me.sajid.strategyDesignPattern.withStrategyDP.strategy;

public class TechnicalStrategy implements WorkStrategy{
    @Override
    public void workStrategy() {
        System.out.println("Do technical stuff.");
    }
}

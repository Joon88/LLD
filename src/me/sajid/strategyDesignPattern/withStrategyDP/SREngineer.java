package me.sajid.strategyDesignPattern.withStrategyDP;

import me.sajid.strategyDesignPattern.withStrategyDP.strategy.TechnicalStrategy;

public class SREngineer extends Employee{
    public SREngineer() {
        super(new TechnicalStrategy());
    }
}

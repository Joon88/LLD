package me.sajid.strategyDesignPattern.withStrategyDP;

import me.sajid.strategyDesignPattern.withStrategyDP.strategy.ManagementStrategy;

public class Manager extends Employee{
    public Manager() {
        super(new ManagementStrategy());
    }
}

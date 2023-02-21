package me.sajid.strategyDesignPattern.withStrategyDP;

import me.sajid.strategyDesignPattern.withStrategyDP.strategy.TechnicalStrategy;

public class Engineer extends Employee{

    public Engineer() {
        super(new TechnicalStrategy());
    }
}

package me.sajid.strategyDesignPattern.withStrategyDP;

import me.sajid.strategyDesignPattern.withStrategyDP.strategy.WorkStrategy;

public class Employee {
    private WorkStrategy ws;

    public Employee(WorkStrategy ws) {
        this.ws = ws;
    }

    public void workStrategy() {
        this.ws.workStrategy();
    }
}

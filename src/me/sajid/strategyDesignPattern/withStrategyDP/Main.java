package me.sajid.strategyDesignPattern.withStrategyDP;


public class Main {
    public static void main(String args[]) {
        Employee e = new Engineer();
        e.workStrategy();

        e = new SREngineer();
        e.workStrategy();

        e = new Manager();
        e.workStrategy();
    }
}

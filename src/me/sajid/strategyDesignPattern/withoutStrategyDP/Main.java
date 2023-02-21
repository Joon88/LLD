package me.sajid.strategyDesignPattern.withoutStrategyDP;

public class Main {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.workStrategy();

        e = new Engineer();
        e.workStrategy();

        e = new SREngineer();
        e.workStrategy();

        e = new Manager();
        e.workStrategy();
    }
}

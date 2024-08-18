package me.sajid.commandDP.commands;

import me.sajid.commandDP.AirConditioner;

public class TurnOnCommand implements Command{
    private AirConditioner ac;

    public TurnOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}

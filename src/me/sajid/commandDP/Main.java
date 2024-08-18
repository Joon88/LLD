package me.sajid.commandDP;

import me.sajid.commandDP.commands.Command;
import me.sajid.commandDP.commands.TurnOffCommand;
import me.sajid.commandDP.commands.TurnOnCommand;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        RemoteController rc = new RemoteController();

        Command on = new TurnOnCommand(ac);
        Command off = new TurnOffCommand(ac);

        rc.executeCommand(on);
        rc.executeCommand(off);
        rc.undoCommand();
        rc.undoCommand();
    }
}

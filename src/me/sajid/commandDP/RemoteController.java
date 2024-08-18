package me.sajid.commandDP;

import me.sajid.commandDP.commands.Command;
import java.util.Stack;

public class RemoteController {
    private final Stack<Command> commandStack = new Stack<>();

    public void executeCommand(Command c) {
        c.execute();
        commandStack.push(c);
    }

    public void undoCommand() {
        if(commandStack.isEmpty()) {
            System.out.println("Nothing in memory to undo!");
            return;
        }
        Command c = commandStack.pop();
        c.undo();
    }
}

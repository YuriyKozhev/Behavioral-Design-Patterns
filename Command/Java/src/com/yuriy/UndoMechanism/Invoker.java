package com.yuriy.UndoMechanism;

public class Invoker {
    Command command;
    UndoCommand undoCommand;

    public Invoker(Command command, UndoCommand undoCommand) {
        this.command = command;
        this.undoCommand = undoCommand;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

    public void undo() {
        undoCommand.execute();
    }
}

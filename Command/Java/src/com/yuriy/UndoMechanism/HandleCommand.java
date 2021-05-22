package com.yuriy.UndoMechanism;

public class HandleCommand implements UndoableCommand {
    Receiver receiver;
    History history;

    public HandleCommand(Receiver receiver, History history) {
        this.receiver = receiver;
        this.history = history;
    }

    @Override
    public void execute() {
        receiver.handle();
        history.push(this);
    }

    @Override
    public void unexecute() {
        System.out.println("Performing undo handle operation...");
    }
}

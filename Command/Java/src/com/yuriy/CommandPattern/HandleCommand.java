package com.yuriy.CommandPattern;

public class HandleCommand implements Command {
    Receiver receiver;

    public HandleCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.handle();
    }
}

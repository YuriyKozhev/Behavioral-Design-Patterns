package com.yuriy.UndoMechanism;

public class UndoCommand implements Command {
    History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0)
            history.pop().unexecute();
    }
}

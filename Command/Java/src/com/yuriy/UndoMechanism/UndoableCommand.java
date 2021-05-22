package com.yuriy.UndoMechanism;

public interface UndoableCommand extends Command {
    void unexecute();
}

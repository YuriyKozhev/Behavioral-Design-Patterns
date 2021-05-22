package com.yuriy.UndoMechanism;

public class UndoMechanismDemo {
    public static void show() {
        Receiver receiver = new Receiver();
        History history = new History();
        UndoableCommand handleCommand = new HandleCommand(receiver,history);
        UndoCommand undoCommand = new UndoCommand(history);
        Invoker invoker = new Invoker(handleCommand,undoCommand);
        invoker.executeCommand();
        invoker.undo();
    }
}

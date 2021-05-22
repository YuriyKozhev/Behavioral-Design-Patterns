package com.yuriy.UndoMechanism;

public class CommandPatternDemo {
    public static void show() {
        Receiver receiver = new Receiver();
        Command handleCommand = new HandleCommand(receiver);
        Invoker invoker = new Invoker(handleCommand);
        invoker.executeCommand();
    }
}

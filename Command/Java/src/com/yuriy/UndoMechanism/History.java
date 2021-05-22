package com.yuriy.UndoMechanism;

import java.util.Stack;

public class History {
    Stack<UndoableCommand> commands = new Stack<>();

    public void push(UndoableCommand command) {
        commands.push(command);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }
}

package com.yuriy;

public class ReceiverB extends Handler {
    public ReceiverB(Handler next) {
        super(next);
    }

    @Override
    protected boolean handle() {
        System.out.println("Receiver B");
        return true;
    }
}

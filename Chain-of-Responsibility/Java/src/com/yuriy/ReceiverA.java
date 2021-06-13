package com.yuriy;

public class ReceiverA extends Handler {
    public ReceiverA(Handler next) {
        super(next);
    }

    @Override
    protected boolean handle() {
        System.out.println("Receiver A");
        return true;
    }
}

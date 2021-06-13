package com.yuriy;

public class ReceiverC extends Handler {
    public ReceiverC(Handler next) {
        super(next);
    }

    @Override
    protected boolean handle() {
        System.out.println("Receiver C");
        return true;
    }
}

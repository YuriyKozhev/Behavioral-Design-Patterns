package com.yuriy;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handleRequest() {
        if (handle() && next != null) {
            next.handleRequest();
        }
    }

    protected abstract boolean handle();
}

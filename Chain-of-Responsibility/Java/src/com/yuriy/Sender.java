package com.yuriy;

public class Sender {
    Handler handler;

    public Sender(Handler handler) {
        this.handler = handler;
    }

    public void handleRequest() {
        handler.handleRequest();
    }
}

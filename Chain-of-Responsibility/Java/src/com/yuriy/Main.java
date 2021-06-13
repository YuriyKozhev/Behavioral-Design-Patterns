package com.yuriy;

public class Main {

    public static void main(String[] args) {
        Handler receiverC = new ReceiverC(null);
        Handler receiverB = new ReceiverB(receiverC);
        Handler receiverA = new ReceiverA(receiverB);
        Sender sender = new Sender(receiverA);
        sender.handleRequest();
    }
}

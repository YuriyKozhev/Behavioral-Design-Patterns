package com.yuriy;

public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("Handle in A way");
    }
}

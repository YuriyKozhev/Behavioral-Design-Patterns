package com.yuriy;

public class ConcreteStateB implements State {

    @Override
    public void handle() {
        System.out.println("Handle in B way");
    }
}
